let products={
    data:[{
        productName:"Regualar White T-shirt",
        category:"Topwear",
        price: "30",
        image:"white-shirt.jpg",
    },
    {
    productName:"Pink Short Skirt",
        category:"Bottomware",
        price: "49",
        image:"short-skirt.jpg",
    },
    {
        productName:"Sporty Watch",
        category:"Watch",
        price: "99",
        image:"sporty-watch.jpg",
    },
    {
        productName:"Basic Knitten Top",
        category:"Topware",
        price: "29",
        image:"knitted-top.jpg",
    }, 
{
    productName:"Black Leather Jacket",
    category:"Jacket",
    price: "150",
    image:"black-leather-jacket.avif",
},
{
    productName:"Stylish Denim Pants",
    category:"Bottomwaer",
    price: "100",
    image:"blue-jeans.jpg",
},
{
    productName:"Brown Jacket",
    category:"Jacket",
    price: "140",
    image:"brown-jacket.jpg",
},
{
    productName:"Confy Gray Pants",
    category:"Bottomwear",
    price: "50",
    image:"comfy-gray-pants.webp",
  },
 ]
};
for(let i of products.data){
    //Creat card
    let card=document.createElement("div");
    //Card should have category and should stay hidden initially
    card.classList.add("card", "i.category","hide");
    //image div
    let imgContainer = document.createElement("div");
    imgContainer.classList.add("image-container");
    //img tag
    let image= document.createElement("img");
    image.setAttribute("src",i.image);
    imgContainer.appendChild(image);
    card.appendChild(imgContainer);
    //container 
    let container= document.createElement("div");
    container.classList.add("container")
    //product name 
    let name = document.createElement("h5");
    name.classList.add("product-name");
    name.innerText= i.productName.toUpperCase();
    container.appendChild(name);
    //price
    let price = document.createElement("h6");
    price.innerText = "$" + i.price;
    container.appendChild( price);

    card.appendChild(container);
    document.getElementById("products").appendChild(card);

    
}