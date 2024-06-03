require('dotenv').config()
const express = require('express')
const mysql = require('mysql2/promise')

const app = express()
const port = 3000

//lädt die sachen aus dem ordner public
app.use(express.static('public'))
app.use(express.json())


//Objekt erstellen
const users = [
    {
        firstname: 'Lukas',
        lastname: 'Zech',
        phone: '43 234234234',
        email: 'lukas.zech@kad.com',
        image: 'https://randomuser.me/api/portraits/men/28.jpg'

    },
    {
        firstname: 'Amol',
        lastname: 'Saldanha',
        phone: '8447924503',
        email: 'amol.saldanha@example.com',
        image: 'https://randomuser.me/api/portraits/men/97.jpg'
    },
    {
        firstname: 'Delia',
        lastname: 'Henríquez',
        phone: '(625) 682 4434',
        email: 'delia.henriquez@user.com',
        image: 'https://randomuser.me/api/portraits/women/15.jpg'
    },
    {
        firstname: 'Leo',
        lastname: 'Johnson',
        phone: '(146)-183-9647',
        email: 'le1@gmailschaas.com',
        image: 'https://randomuser.me/api/portraits/men/37.jpg'
    },


];



//horcht auf localhost:3000
app.get('/api/test', (req, res) => {
    res.send(
        users
    )
})

app.get('/api/country', async (req, res) => {
    console.log(req)
    console.log(req.query.name)
    let connection = await connectToDatabase()
    try {
        const [results, fields] = await connection.query(
            'SELECT * FROM country ORDER BY name'
        );
        console.log(results);
        console.log(fields);
        res.send(results)
    }

    catch (err) {
        console.log(err)
    }

})

console.log(process.env.MYSQL_USER, process.env.MYSQL_PASSWORD)
if (process.env.MYSQL_USER == undefined || process.env.MYSQL_PASSWORD == undefined) {
    console.error('Please create .env file with MYSQL_USER and MYSQL_PASSWORD')
    throw new Error('Please create .env file with MYSQL_USER and MYSQL_PASSWORD')
}



app.listen(port, () => {
    console.log(`Rest API Server listening on port ${port}`)
})

let connection = undefined;
async function connectToDatabase() {
    connection = await mysql.createConnection({
        host: 'localhost',
        user: process.env.MYSQL_USER,
        password: process.env.MYSQL_PASSWORD,
        database: 'mondial'
    })
    console.log('DB connection established')
    return connection;

}