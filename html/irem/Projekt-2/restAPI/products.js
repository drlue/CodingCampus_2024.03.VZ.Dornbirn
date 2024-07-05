
let products = {
    data: [{
        productName: "Regualar White T-shirt",
        category: "Topwear",
        price: "180",
        image: "white-shirt.jpg",
    },
    {
        productName: "Pink Short Skirt",
        category: "Bottomwear",
        price: "80",
        image: "short-skirt.jpg",
        isOnSale: true,
        discountPercentage: 30
    },
    {
        productName: "Sporty Watch",
        category: "Watch",
        price: "1.680",
        image: "sporty-watch.jpg",
    },
    {
        productName: "Basic Knitten Top",
        category: "Topware",
        price: "40",
        image: "knitted-top.jpg",
    },
    {
        productName: "Black Leather Jacket",
        category: "Jacket",
        price: "900",
        image: "black-leather-jacket.avif",
        isOnSale: true,
        discountPercentage: 10
    },
    {
        productName: "Stylish Denim Pants",
        category: "Bottomwear",
        price: "170",
        image: "blue-jeans.jpg",
    },
    {
        productName: "Brown Jacket",
        category: "Jacket",
        price: "800",
        image: "brown-jacket.jpg",
    },
    {
        productName: "Confy Gray Pants",
        category: "Bottomwear",
        price: "70",
        image: "comfy-gray-pants.webp",
        isOnSale: true,            //Sale
        discountPercentage: 20     //Sale auf %?

    },
  ],
};

// Diese Funktion wird exportiert, um sie im Hauptserver-Setup-File zu verwenden. 
// Sie initialisiert Routen für Produktoperationen, die auf einem Express-App-Objekt basieren.
export default function initProducts(app){

    // Route definiert einen Endpunkt für HTTP GET-Anfragen, der zum Abrufen der Produktliste verwendet wird.
    app.get('/api/products', (req, res) => {
        // Loggt die Anfrageart (GET), den Pfad ('/api/products') und etwaige Abfrageparameter, um Debugging zu unterstützen.
        console.log('GET', '/api/products', req.query);
        // Sendet die gesamte Produktdatenliste als Antwort zurück.
        res.send(products);
    });

    // Route definiert einen Endpunkt für HTTP POST-Anfragen, der zum Hinzufügen neuer Produkte verwendet wird.
    app.post('/api/products', (req, res) => {
        // Loggt die Anfrageart (POST), den Pfad ('/api/products') und den Inhalt des Anfragekörpers (req.body).
        console.log('POST', '/api/products', req.body);
        // Fügt das neue Produkt, das im Anfragekörper spezifiziert wurde, zur Produktdatenbank hinzu.
        products.data.push({
            productName: req.body.productName, // Der Name des Produktes.
            category: req.body.category,       // Die Kategorie des Produktes.
            price: req.body.price,             // Der Preis des Produktes.
            image: req.body.image,             // Der Pfad oder die URL zum Bild des Produktes.
        });
        // Sendet einen HTTP-Statuscode 200 zurück, um zu signalisieren, dass das Produkt erfolgreich hinzugefügt wurde.
        res.sendStatus(200);
    });
}


