require('dotenv').config();
const express = require('express');
const mysql = require('mysql2/promise');

const app = express();
const port = 3000;

app.use(express.json());

app.get('/api/rivers', async (req, res) => {
    const countryName = req.query.country;
    if (!countryName) {
        return res.status(400).send('Ländername ist als Abfrageparameter erforderlich .');
    }

    let connection;
    try {
        connection = await mysql.createConnection({
            host: 'localhost',
            user: 'irem',
            password: 'irem',
            database: 'mondial'
        });

        const [rivers] = await connection.execute(
            `SELECT river.name, river.length, river.sourceelevation, river.mouth 
             FROM river 
             JOIN country ON river.country = country.code 
             WHERE country.name = ?;`, 
            [countryName]
        );

        res.json(rivers);
    } catch (err) {
        console.error(err);
        res.status(500).send('Fehler bei der Abfrage der Datenbank');
    } finally {
        if (connection) {
            connection.end();
        }
    }
});
app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});

/*Express-Server gestartet wird und auf dem angegebenen Port auf Netzwerkanfragen wartet*/