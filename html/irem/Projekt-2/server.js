import dotenv from 'dotenv'
import express from 'express'
import mysql from 'mysql2/promise'
import initProducts from './restAPI/products.js'

dotenv.config()


export const app = express()
const port = 3000

app.use(express.static('public'))
app.use(express.json())

initProducts(app)

const users = [
    { name: 'tobi' },

    { name: 'loki' },
    { name: 'jane' }
  ];

app.get('/api/test', (req, res) => {
  res.send(users)
})

app.get('/api/country', async (req, res) => {
    let searchParam = req.query.name + "%"
    let connection = await connectToDatabase()
    try {
        const [results, fields] = await connection.query(
          'SELECT * FROM country WHERE name like ?',
          searchParam
        );
        
        res.send(results)
      } catch (err) {
        console.log(err);
        res.sendStatus(404)
      }

})


if (process.env.MYSQL_USER == undefined || process.env.MYSQL_PASSWORD == undefined){
    console.error('Please create a .env file with MYSQL_USER and MYSQL_PASSWORD')
    throw new Error('Please create a .env file with MYSQL_USER and MYSQL_PASSWORD')
}




app.listen(port, () => {
  console.log(`Rest API Server listening on port ${port}`)
})

let connection = undefined;
async function connectToDatabase(){
    if (connection == undefined){
        connection = await mysql.createConnection({
            host: 'localhost',
            user: process.env.MYSQL_USER,
            password: process.env.MYSQL_PASSWORD,
            database: 'mondial',
        });
        console.log('DB connection established.')
    } 
    return connection

}


