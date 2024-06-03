require('dotenv').config()
const express = require('express')
const mysql = require('mysql2/promise')

const app = express()
const port = 3000

app.use(express.static('public'))
app.use(express.json())

const users = [
    {
        name: 'Tobi WanKenobi', 
        age: 20,
        email: 'tobi.wankenobi@gmail.com',
        job: 'Jedi',
        faceImage: '/tobiwankenobi.png'
    },

    {
        name: 'Moli Teletabi',
        age: 30,
        email: 'moli.teletabi@gmail.com',
        job: 'Tee-Mobile',
        faceImage: '/moli.png'
     },

    {
        name: 'Curry Chicken',
        age: 44,
        email: 'chicken.curry@gmail.com',
        job: 'Indian Tech Support Restaurant',
        faceImage: '/curry.png'
    }
];

app.get('/api/test', (req, res) => {
  res.send(users)
})

app.get('/country', (req,res) => {
    let connection = connectToDatabase()

    res.send('OK')
})


if(process.env.MYSQL_USER == undefined || process.env.MYSQL_PASSWORD == undefined){
    console.error('Please create a .env file with MYSQL_USER and MYSQL_PASSWORD')
    throw new Error('Please create a .env file with MYSQL_User and MYSQL_Password')
}


app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
let connection = undefined;
async function connectToDatabase(){
    if (connection == undefined){

    const connection = await mysql.createConnection({
        host: 'localhost',
        user: process.env.MYSQL_USER,
        password: process.env.MYSQL_PASSWORD,
        database: 'mondial',
      });
      console.log('DB connection established')
    }
      
      return connection
}