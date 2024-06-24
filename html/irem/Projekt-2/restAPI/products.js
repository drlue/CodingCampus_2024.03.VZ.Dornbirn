
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
    },
  ],
};



export default function initProducts(app){
    app.get('/api/products', (req, res) => {
        console.log('/api/products', req.query)
        res.send(products)
      })
}

