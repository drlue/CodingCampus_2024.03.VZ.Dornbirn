let products = {
    data: [{
        productName: "Regualar White T-shirt",
        category: "Topwear",
        price: "30",
        image: "white-shirt.jpg",
    },
    {
        productName: "Pink Short Skirt",
        category: "Bottomware",
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
        category: "Bottomwaer",
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

function createProduct(i) {
    //Creat card
    let card = document.createElement("div");
    //Card should have category and should stay hidden initially
    card.classList.add("card", i.category,);
    //image div
    let imgContainer = document.createElement("div");
    imgContainer.classList.add("image-container");
    //img tag
    let image = document.createElement("img");
    image.setAttribute("src", i.image);
    imgContainer.appendChild(image);
    card.appendChild(imgContainer);
    //container 
    let container = document.createElement("div");
    container.classList.add("container");
    //product name 
    let name = document.createElement("h5");
    name.classList.add("product-name");
    name.innerText = i.productName.toUpperCase();
    container.appendChild(name);
    //price
    let price = document.createElement("h6");
    price.innerText = "$" + i.price;
    container.appendChild(price);

    card.appendChild(container);

    return card;
}

//parameter passed from button (parameter same as category)
function filterProductByCategory(category) {
    console.log(category)
    //button class code 
    let buttons = document.querySelectorAll("button-value");
    buttons.forEach(button => {
        //check if value equals innerText
        if (value.toUpperCase() == button.innerText.toUpperCase()) {
            button.classList.add("active");
        } else {
            button.classList.remove("active");
        }
    });
    // //select all cards 
    // let elements = document.querySelectorAll(".card");
    // //loop through all cards
    // elements.forEach((element) => {
    //     //display all cards on cards 'all' button click 
    //     if (value == "all") {
    //         element.classList.remove("hide");
    //     }
    //     else {
    //         //check if elemnt contains catogory class 
    //         if (element.classList.add(value)) {
    //             //dsplay elemnt based on catogory
    //             element.classList.remove("hide");
    //         }
    //         else {
    //             //hide other elements 
    //             element.classList.add("hide");

    //         }
    //     }
    // });
    
    const productList = document.getElementById("products")
    while(productList.firstChild) {
        productList.removeChild(productList.firstChild)
    } 

    const filteredProducts = products.data.filter((product) => {
        if(category == 'All') {
            return true
        } else if(product.category == category) {
            return true;
        } else {
            return false;
        }
    })

    for (let i of filteredProducts) {
        let card = createProduct(i)
        document.getElementById("products").appendChild(card);
    }
}
//searach button click
function filterProductBySearch() {
    //initializations
    let searchInput = document.getElementById("search-input").value;
    let elements = document.querySelectorAll(".product-name");
    let cards = document.querySelectorAll(".card");
    cards.forEach(card => {
        let productName = card.querySelector(".product-name").textContent.toLocaleLowerCase();
        card.style.disyplay = productName.includes(searchInput)? '' : 'none'; 
    });
  

    // //loop throug all element
    // elements.fCorEach((element, index) => {
    //     //check if text includes the search value
    //     if (element.innerText.includes(searachInput.toUpperCase())) {
    //         //display matching card
    //         card[index].classList.remove("hide");
    //     }
    //     else {
    //         //hide others
    //         cards[index].classList.add("hide");
    //     }
    // })

   //product.productName.indexOf(searchtext) != -1
}

//initially display all products
window.onload = () => {
    filterProductByCategory("All");
};