const express = require('express')
const app = express()
const port = 3000

//lädt die sachen aus dem ordner public
app.use(express.static('public'))


//Objekt erstellen
const users = [
    {name: 'luki'},
    {name: 'olaf'},
    {name: 'franz'}, ];
 


//horcht auf localhost:3000
app.get('/api/test', (req, res) => {
    res.send(
        users
    )
})

app.listen(port, () => {
    console.log(`Rest API Server listening on port ${port}`)
})