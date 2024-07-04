
let products = {
    data: [{
        productName: "Regualar White T-shirt",
        category: "Topwear",
        price: "30",
        image: "white-shirt.jpg",
    },
    {
        productName: "Pink Short Skirt",
        category: "Bottomwear",
        price: "49",
        image: "short-skirt.jpg",
        isOnSale: true,
        discountPercentage: 30
    },
    {
        productName: "Sporty Watch",
        category: "Watch",
        price: "99",
        image: "sporty-watch.jpg",
    },
    {
        productName: "Basic Knitten Top",
        category: "Topware",
        price: "29",
        image: "knitted-top.jpg",
    },
    {
        productName: "Black Leather Jacket",
        category: "Jacket",
        price: "150",
        image: "black-leather-jacket.avif",
        isOnSale: true,
        discountPercentage: 10
    },
    {
        productName: "Stylish Denim Pants",
        category: "Bottomwear",
        price: "100",
        image: "blue-jeans.jpg",
    },
    {
        productName: "Brown Jacket",
        category: "Jacket",
        price: "140",
        image: "brown-jacket.jpg",
    },
    {
        productName: "Confy Gray Pants",
        category: "Bottomwear",
        price: "50",
        image: "comfy-gray-pants.webp",
        isOnSale: true,
        discountPercentage: 20

    },
  ],
};

export default function initProducts(app){
    app.get('/api/products', (req, res) => {
        console.log('GET', '/api/products', req.query)
        res.send(products)
      })

    app.post('/api/products', (req, res) => {
        console.log('POST', '/api/products', req.body)
        products.data.push({
            productName: req.body.productName,
            category: req.body.category,
            price: req.body.price,
            image: req.body.image,            
        })
        res.sendStatus(200)
    })
}

