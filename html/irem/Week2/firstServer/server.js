require('dotenv').config()
const mysql = require('mysql2/promise')
const express = require('express')
const app = express()
const port = 3000

app.use(express.static('public'))

let connection = undefined






async function getConnection(){
    if (connection == undefined){
        connection = await mysql.createConnection({
            host: 'localhost',
            user: process.env.MYSQL_USER,
            password: process.env.MYSQL_PASSWORD,
            database: 'mondial',
          });        
    }
    return connection
}


app.get('/hello', (req, res) => {
  res.send('Hello World!')
})


app.get('/api/country', (req, res) => {
  getConnection().then(async () => {
    try {
        const [results, fields] = await connection.query(
          'SELECT * FROM country WHERE Name like ?',
          ["A%"]
        );
      
        res.send(results)
        //console.log(results); // results contains rows returned by server
        //console.log(fields); // fields contains extra meta data about results, if available
      } catch (err) {
        console.log(err);
      }
})


})



app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})