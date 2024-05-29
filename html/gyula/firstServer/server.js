const express = require('express')
const app = express()
const port = 3000

app.use(express.static('public'))
app.use(express.json())

const users = [
    { name: 'tobi' },
    { name: 'loki' },
    { name: 'jane' }
  ];

app.get('/api/test', (req, res) => {
  res.send(users)
})

app.listen(port, () => {
  console.log(`Rest API Server listening on port ${port}`)
})