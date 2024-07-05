let products = undefined // Initialisiert `products` als `undefined`. Diese Variable wird später genutzt, um die Produktliste zu speichern,
// die von einem Server geladen oder dynamisch verändert wird.

let wishlist = []; // Erstellt ein Array `wishlist`, das dazu dient, die Produkte aufzunehmen, die ein Benutzer zu seiner Wunschliste hinzufügen möchte.

let state = { // Definiert ein Objekt `state`, das die Zustände verschiedener Filter und Suchkriterien speichert, welche die angezeigten Produkte beeinflussen.

    category: "All", // Standardkategorie, die festlegt, dass initial Produkte aller Kategorien angezeigt werden.
    minPrice: 0, // Setzt den minimalen Preisfilter auf 0, um keine preisliche Untergrenze zu haben.
    maxPrice: 999, // Setzt den maximalen Preisfilter auf 999, beschränkt also die angezeigten Produkte auf diesen Höchstpreis.
    searchTerm: "",// Der Suchbegriff ist initial leer, es wird also ohne Einschränkung nach Namen gefiltert.
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

function createProduct(i) { //Parameter i eigenschaften -> category, image, productName, isOnSale, price, und discountPercentage
    let card = document.createElement("div");//div element als Container für gesamte Produktkarte
    card.classList.add("card", i.category);

    let imgContainer = document.createElement("div");
    imgContainer.classList.add("image-container");//ist für das Bild Produkt vorgesehen
    let image = document.createElement("img");//Setzt Attribute auf die Bild Url die im Produktobjekt gespeichert ist----
    image.src = i.image;//-----------------------------------------------------------------------------------------------
    imgContainer.appendChild(image);
    card.appendChild(imgContainer);

    let container = document.createElement("div");// erneutes div für die Aufnahme weiterer Produktdetails---
    container.classList.add("container");//------------------------------------------------------------------

    let name = document.createElement("h5");// h5 element für produktnamen in gross buchstaben----
    name.innerText = i.productName.toUpperCase();//----------------------------------------------
    container.appendChild(name);

    let price = document.createElement("h6");//h6 element für Preis-----------
    if (i.isOnSale) {
        const salePrice = i.price - (i.price * i.discountPercentage / 100);
        price.innerText = "$" + salePrice.toFixed(2) + " (Sale)";
        price.style.color = "red";
    } else {
        price.innerText = "$" + i.price;
    }
    container.appendChild(price);

    let detailButton = document.createElement("button"); // beim klicken wird die showDetail aufgerufen-----
    detailButton.innerText = "Details";
    detailButton.className = "common-button"; // Stellt sicher, dass dieser Button die gleiche Klasse hat----
    detailButton.onclick = function () {
        showDetails(i);
    };
    container.appendChild(detailButton);

    let addButton = document.createElement('button'); //Beim Klick wird addToWishlist(i) aufgerufen----
    addButton.innerText = "Add to Wishlist";
    addButton.className = "common-button"; 
    addButton.onclick = function () {
        addToWishlist(i);
    };
    container.appendChild(addButton);

    card.appendChild(container); // Alle erstellten Elemente (Name, Preis, Buttons) werden zum container hinzugefügt----
    return card;                //und der container wird wiederum zum card hinzugefügt----------------------------------
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
function showDetails(product) {
    // Erstellt ein div-Element für den Hintergrund des Modals
    let modal = document.createElement("div");
    modal.classList.add('modalBackground')

    // Erstellt ein weiteres div-Element, das den Container für die Produktdetails darstellt
    let detailContainer = document.createElement('div')
    detailContainer.classList.add('detailsContainer')

    // Erstellt ein h1-Element und setzt den Produktnamen als Textinhalt
    let h1Element = document.createElement('h1')
    h1Element.innerText = product.productName
    detailContainer.appendChild(h1Element)

    // Erstellt ein p-Element für die Preisinformation
    let pElement = document.createElement('p')
    if (product.isOnSale) {
         // Erstellt ein span-Element für den Originalpreis und durchstreicht diesen
        let originalPrice = document.createElement('span'); // span-> hat keinen bedeutung kann es anweden ohne etwas zu beeinflussen.
        originalPrice.style.textDecoration = 'line-through';
        originalPrice.innerText = "$" + product.price;
        
         // Erstellt ein weiteres span-Element für den reduzierten Preis
        let salePrice = document.createElement('span');
        salePrice.style.color = 'red';
        let discountedPrice = product.price - (product.price * product.discountPercentage / 100);
        salePrice.innerText = " $" + discountedPrice.toFixed(2);
        
        // Fügt den Originalpreis, den Text 'Now:' und den reduzierten Preis zum p-Element hinzu
        pElement.appendChild(originalPrice);
        pElement.appendChild(document.createTextNode(' Now:'));
        pElement.appendChild(salePrice);
    } else {
        // Setzt den normalen Preis als Textinhalt, wenn das Produkt nicht im Angebot ist
        pElement.innerText = "Price: $" + product.price;
    }
    detailContainer.appendChild(pElement) // Fügt das p-Element zum Detail-Container hinzu

    // Erstellt ein img-Element für das Produktbild
    let imgElement = document.createElement('img')
    imgElement.classList.add('detailsImage')
    imgElement.src = product.image
    imgElement.alt = product.productName
    detailContainer.appendChild(imgElement) // Fügt das Bild zum Detail-Container hinzu

    // Erstellt einen Schließen-Button und fügt ihm einen Klick-Eventlistener hinzu
    let closeButton = document.createElement('button')
    closeButton.innerText = "Schließen"
    closeButton.addEventListener('click', () => {
        document.body.removeChild(modal) // Entfernt das Modal vom DOM beim Klicken
    })
    detailContainer.appendChild(closeButton)// Fügt den Button zum Detail-Container hin
    modal.appendChild(detailContainer) // Fügt das Detail-Container-Div zum Modal-Div hinzu das enthält alle spezifischen Details des Produkts
    // wie Namen Preis und Bild
    document.body.appendChild(modal);// Fügt das komplett zusammengestellte Modal-Div zum Body des Dokuments hinzu, wodurch das Modal sichtbar
    // und über den anderen Inhalten der Seite positioniert wird.
}
//------------------------------------------------------------------------------------------------------------------------------------------------//

function addToWishlist(product) {
    // Überprüft, ob das Produkt bereits in der Wunschliste vorhanden ist
    if (!wishlist.some(item => item.productName === product.productName)) {
        wishlist.push(product); // Fügt das Produkt zur Wunschliste hinzu, wenn es nicht gefunden wurde
        displayWishlist();// Aktualisiert die Anzeige der Wunschliste
    }
}

function displayWishlist() {
    const wishlistItems = document.getElementById('wishlist-items');  // Greift auf das DOM-Element zu, das die Wunschliste enthält
    wishlistItems.innerHTML = ''; // Löscht vorhandene Einträge in der Wunschliste, um Duplikate zu vermeiden

    // Iteriert über jedes Element in der Wunschliste
    wishlist.forEach(item => {
        const itemDiv = document.createElement('div'); // Erstellt ein neues div-Element für jedes Produkt
        itemDiv.classList.add('card'); // Fügt eine CSS-Klasse hinzu für Styling
         // Setzt das HTML-Inneres des div-Elements mit Produktinformationen und einem Entfernen-Button
        itemDiv.innerHTML = `
            <h5>${item.productName}</h5>
            <p>$${item.price}</p>
            <button onclick="removeFromWishlist('${item.productName}')">Remove</button>
        `;
        wishlistItems.appendChild(itemDiv); // Fügt das div-Element zur Anzeige der Wunschliste hinzu
    });
}

function removeFromWishlist(productName) {
    // Aktualisiert die Wunschliste, indem Produkte, die nicht dem angegebenen Produktnamen entsprechen behalten werden
    wishlist = wishlist.filter(item => item.productName !== productName);
    displayWishlist(); // Aktualisiert die Anzeige der Wunschliste nach der Entfernung
}
//Funktionalität des Auf- und Zuklappens zu ermöglichen
document.getElementById('toggle-wishlist').addEventListener('click', function() {
    var wishlist = document.getElementById('wishlist-items');
    if (wishlist.style.display === 'none') {
        wishlist.style.display = 'block';
    } else {
        wishlist.style.display = 'none';
    }
});
//------------------------------------------------------------------------------------------------------------------------------------------------//
function updateContent(){
    // Zugriff auf das DOM-Element, das die Produktliste enthält
    const productList = document.getElementById("products")
    // Entfernt alle vorhandenen Kind-Elemente in der Produktliste, um eine neue Liste anzeigen zu können
    while (productList.firstChild) {
        productList.removeChild(productList.firstChild)
    }
    // Filtert Produkte basierend auf dem aktuellen Zustand des Filters und der Suchkriterien
    const filteredProducts = products.data.filter(product => 
        ((state.category == 'All') || (product.category == state.category)) &&
        (state.searchTerm === '' || product.productName.toLocaleUpperCase().includes(state.searchTerm.toLocaleUpperCase())) &&
        (state.minPrice === '' || Number(product.price) >= Number(state.minPrice)) &&
        (state.maxPrice === '' || Number(product.price) <= Number(state.maxPrice)) 
    );
    // Erstellt neue Produktkarten für jedes gefilterte Produkt und fügt diese zur Produktliste hinzu
    for (let i of filteredProducts) {
        let card = createProduct(i)
        productList.appendChild(card);
    }    
}
//------------------------------------------------------------------------------------------------------------------------------------------------//
function deleteProduct(productName) {
     // Filtert die Produktdaten, um das spezifische Produkt zu entfernen
    products.data = products.data.filter(product => product.productName !== productName);
    
    // Setzt den Kategoriefilter zurück auf "All" und aktualisiert die Inhalte
    state.category = "All"
    updateContent()
}

function filterProductByCategory(category) {
    // Wählt alle Kategorie-Buttons aus und aktualisiert ihre aktive Klasse basierend auf der Auswahl
    let buttons = document.querySelectorAll(".button-value");
    buttons.forEach(button => {
        if (category.toUpperCase() === button.innerText.toUpperCase()) {
            button.classList.add("active"); // Markiert den Button als aktiv
        } else {
            button.classList.remove("active");// Entfernt die aktive Markierung von anderen Buttons
        }
    });
    // Setzt die ausgewählte Kategorie im Zustand und aktualisiert die Inhalte
    state.category = category
    updateContent()
}
//------------------------------------------------------------------------------------------------------------------------------------------------//
function filterProductsByPrice() {
     // Holt den Wert des Mindestpreises aus dem entsprechenden Eingabefeld
    const minPrice = document.getElementById('min-price').value;
      // Holt den Wert des Höchstpreises aus dem entsprechenden Eingabefeld
    const maxPrice = document.getElementById('max-price').value;
    
    // Setzt die Zustandsvariablen für Mindest- und Höchstpreis
    state.minPrice = minPrice
    state.maxPrice = maxPrice
     // Ruft `updateContent` auf, um die Produktdaten mit den neuen Filtereinstellungen zu aktualisieren
    updateContent()
}
//------------------------------------------------------------------------------------------------------------------------------------------------//
//searach button click
function filterProductBySearch() {
    // Holt den Wert aus dem Such-Eingabefeld und konvertiert es in Kleinbuchstaben
    let searchInput = document.getElementById("search-input").value.toLowerCase();

    // Setzt den Suchbegriff im Zustand der Anwendung
    state.searchTerm = searchInput
    // Aktualisiert die angezeigten Inhalte, um die Filterung zu reflektieren
    updateContent()
}

//------------------------------------------------------------------------------------------------------------------------------------------------//

async function loadData(searchTerm) {
     // Sendet eine GET-Anfrage an den Server mit dem Suchbegriff als URL-kodierten Parameter
    const response = await fetch('/api/products/?search=' + encodeURIComponent(searchTerm));
    const data = await response.json() // Wandelt die Antwort in JSON um
    return data; // Gibt die geladenen Daten zurück
}
//------------------------------------------------------------------------------------------------------------------------------------------------//
async function addNewProduct() {
    // Sendet eine POST-Anfrage an den Server mit den neuen Produktinformationen im JSON-Format
    const response = await fetch('/api/products', {
        method: "POST",
        headers: {
/*          'Accept': 'application/json', */
            'Content-Type': 'application/json' // Setzt den Content-Type Header für JSON
        },
        body: JSON.stringify({
            // Hier sollten die Daten des neuen Produkts angegeben werden, z.B.:
            //*productName: "Irem's Jacket",
            //*category:"Jacket",
            //*price: "240",
            //*image: "brown-jacket.jpg",    
        })
    })
    console.log('response', response.status, response.statusText) // Loggt den Status der Antwort
    products = await loadData(''); // Lädt alle Produkte neu, um die Liste zu aktualisieren
    filterProductByCategory("All");// Setzt den Kategoriefilter zurück und aktualisiert die Anzeige
}
//------------------------------------------------------------------------------------------------------------------------------------------------//
//Sale 
function toggleSale(productName, isOnSale, discount) {
     // Sucht das Produkt in der Produktliste anhand des Produktnamens
    const product = products.data.find(p => p.productName === productName);
    if (product) {
        // Setzt den Verkaufsstatus des Produkts
        product.isOnSale = isOnSale;
        // Setzt den Rabattprozentsatz des Produkts
        product.discountPercentage = discount;
        // Ruft `updateContent` auf, um die Produktliste mit dem aktualisierten Produkt zu aktualisieren
        updateContent(); // Aktualisiere die Anzeige
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------//
//initially display all products
window.onload = async () => {
    // Lädt alle Produkte beim Start der Anwendung
    products = await loadData('');
    // Setzt den Filter auf "All", um alle Produkte anzuzeigen
    filterProductByCategory("All");
     // Setzt bestimmte Produkte in den Sale-Modus
     toggleSale("Produktname", true, 20); // Hier sollte der korrekte Produktname angegeben werden

    //addNewProduct()
    // Diese Zeile kann aktiviert werden, um automatisch ein neues Produkt hinzuzufügen
};