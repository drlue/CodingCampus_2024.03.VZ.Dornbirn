/*
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
*/

let products = undefined

async function loadData(searchTerm) {
    const response = await fetch('/api/products/?search=' + encodeURIComponent(searchTerm));
    const data = await response.json()
    return data;
}
//----------------------------------------------------------------------------------------------//

function deleteProduct(productName) {
    products.data = products.data.filter(product => product.productName !== productName);
    filterProductByCategory("All"); // Dies lädt die Liste mit den verbleibenden Produkten neu
}
//----------------------------------------------------------------------------------------------//

function createProduct(i) {
    let card = document.createElement("div");
    card.classList.add("card", i.category);

    let imgContainer = document.createElement("div");
    imgContainer.classList.add("image-container");
    let image = document.createElement("img");
    image.src = i.image;
    imgContainer.appendChild(image);
    card.appendChild(imgContainer);

    let container = document.createElement("div");
    container.classList.add("container");

    let name = document.createElement("h5");
    name.classList.add("product-name");
    name.innerText = i.productName.toUpperCase();
    container.appendChild(name);

    let price = document.createElement("h6");
    price.innerText = "$" + i.price;
    container.appendChild(price);

    let detailButton = document.createElement("button");
    detailButton.innerText = "Details";
    detailButton.onclick = function () {
        showDetails(i);
    };
    container.appendChild(detailButton);

    let deleteButton = document.createElement("button");
    deleteButton.innerText = "Delete";
    deleteButton.onclick = function () {
        deleteProduct(i.productName);
    };
    container.appendChild(deleteButton);

    card.appendChild(container);
    return card;
}

//----------------------------------------------------------------------------------------------//

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
    //----------------------------------------------------------------------------------------------//

    const productList = document.getElementById("products");
    while (productList.firstChild) {
        productList.removeChild(productList.firstChild);
    }

    const filteredProducts = products.data.filter(product => (category === 'All' || product.category === category));
    filteredProducts.forEach(product => {
        let card = createProduct(product);
        productList.appendChild(card);
    });
}
//----------------------------------------------------------------------------------------------//
 function showDetails(product) {
    let modal = document.createElement("div");
    modal.style.position = "fixed";
    modal.style.left = "0";
    modal.style.top = "0";
    modal.style.width = "100%";
    modal.style.height = "100%";
    modal.style.backgroundColor = "rgba(0,0,0,0.5)";
    modal.style.display = "flex";
    modal.style.alignItems = "center";
    modal.style.justifyContent = "center";
    modal.style.flexDirection = "column";
    modal.innerHTML = `<div style="background:white; padding:20px; border-radius:5px;">
        <h1>${product.productName}</h1>
        <p>Price: $${product.price}</p>
        <img src="${product.image}" alt="${product.productName}" style="height:200px;">
        <button onclick="this.parentNode.parentNode.removeChild(this.parentNode)">Close</button>
    </div>`;
    document.body.appendChild(modal);
}

//----------------------------------------------------------------------------------------------//

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

//----------------------------------------------------------------------------------------------//

const productList = document.getElementById("products")
while (productList.firstChild) {
    productList.removeChild(productList.firstChild)
}

const filteredProducts = products.data.filter((product) => {
    if (category == 'All') {
        return true
    } else if (product.category == category) {
        return true;
    } else {
        return false;
    }
})

for (let i of filteredProducts) {
    let card = createProduct(i)
    document.getElementById("products").appendChild(card);
}
function deleteProduct(productName) {
    products.data = products.data.filter(product => product.productName !== productName);
    filterProductByCategory("All");
}

function filterProductByCategory(category) {
    let buttons = document.querySelectorAll(".button-value");
    buttons.forEach(button => {
        if (category.toUpperCase() === button.innerText.toUpperCase()) {
            button.classList.add("active");
        } else {
            button.classList.remove("active");
        }
    });

    const productList = document.getElementById("products");
    while (productList.firstChild) {
        productList.removeChild(productList.firstChild);
    }

    const filteredProducts = products.data.filter(product => (category === 'All' || product.category === category));
    filteredProducts.forEach(product => {
        let card = createProduct(product);
        productList.appendChild(card);
    });
}

//----------------------------------------------------------------------------------------------//

//searach button click
function filterProductBySearch() {
    let searchInput = document.getElementById("search-input").value.toLowerCase();
    let cards = document.querySelectorAll(".card");

    cards.forEach(card => {
        let productName = card.querySelector(".product-name").textContent.toLowerCase();
        card.style.display = productName.includes(searchInput) ? '' : 'none';
    });
}
//----------------------------------------------------------------------------------------------//

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


//----------------------------------------------------------------------------------------------//

//initially display all products
window.onload = async () => {
    products = await loadData('');
    filterProductByCategory("All");
};