


async function loadChuckNoris() {
    try {
        const response = await fetch('https://api.chucknorris.io/jokes/random');
        if (!response.ok) {
            throw new Error("Netzwerkantwort war nicht ok " + response.statusText);
        }
        const data = await response.json();
        console.log(data);

        let paragraph = document.createElement('p');
        paragraph.innerText = data.value;
        document.getElementById('output').appendChild(paragraph);
        } catch (error) {
        console.error("Es gab ein Problem mit dem Abrufen der Daten:", error);
        alert("Kryptowährung nicht gefunden. Bitte versuche es erneut.");
        }
}
