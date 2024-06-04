// Funktion zum Abrufen von Daten von der CoinGecko API
async function fetchCryptoData() {
  const cryptoName = document
    .getElementById("crypto-input")
    .value.toLowerCase();
  const apiUrl = `https://api.coingecko.com/api/v3/coins/${cryptoName}`;

  try {
    const response = await fetch(apiUrl);
    if (!response.ok) {
      throw new Error("Netzwerkantwort war nicht ok " + response.statusText);
    }
    const data = await response.json();
    populateTable(data);
  } catch (error) {
    console.error("Es gab ein Problem mit dem Abrufen der Daten:", error);
    alert("Kryptowährung nicht gefunden. Bitte versuche es erneut.");
  }
}

// Funktion zum Befüllen der Tabelle mit den abgerufenen Daten
function populateTable(coin) {
  const table = document.getElementById("crypto-table");
  const tableBody = document.getElementById("crypto-table-body");
  tableBody.innerHTML = ""; // Bestehenden Inhalt löschen

  const row = document.createElement("tr");

  const imageCell = document.createElement("td");
  const img = document.createElement("img");
  img.src = coin.image.small;
  img.alt = coin.name;
  imageCell.appendChild(img);
  row.appendChild(imageCell);

  const nameCell = document.createElement("td");
  nameCell.textContent = coin.name;
  row.appendChild(nameCell);

  const symbolCell = document.createElement("td");
  symbolCell.textContent = coin.symbol.toUpperCase();
  row.appendChild(symbolCell);

  const priceCell = document.createElement("td");
  priceCell.textContent = `$${coin.market_data.current_price.usd.toLocaleString()}`;
  row.appendChild(priceCell);

  const marketCapCell = document.createElement("td");
  marketCapCell.textContent = `$${coin.market_data.market_cap.usd.toLocaleString()}`;
  row.appendChild(marketCapCell);

  tableBody.appendChild(row);
  table.style.display = "table"; // Tabelle anzeigen
}
