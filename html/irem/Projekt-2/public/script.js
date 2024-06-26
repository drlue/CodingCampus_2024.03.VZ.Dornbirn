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
let wishlist = []; 
let state = {
    category: "All",
    minPrice: 0,
    maxPrice: 999,
    searchTerm: "",
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

    let addButton = document.createElement('button');
    addButton.innerText = "Add to Wishlist";
    addButton.className = "common-button"; 
    addButton.onclick = function () {
        addToWishlist(i);
    };
    container.appendChild(addButton);

    card.appendChild(container);
    return card;
}

//----------------------------------------------------------------------------------------------//
 function showDetails(product) {
    let modal = document.createElement("div");
    modal.classList.add('modalBackground')

    let detailContainer = document.createElement('div')
    detailContainer.classList.add('detailsContainer')

    let h1Element = document.createElement('h1')
    h1Element.innerText = product.productName
    detailContainer.appendChild(h1Element)

    let pElement = document.createElement('p')
    h1Element.innerText = "Price: $" + product.price
    detailContainer.appendChild(pElement)

    let imgElement = document.createElement('img')
    imgElement.classList.add('detailsImage')
    imgElement.src = product.image
    imgElement.alt = product.productName
    detailContainer.appendChild(imgElement)

    let closeButton = document.createElement('button')
    closeButton.innerText = "Nicht schließen"
    closeButton.addEventListener('click', () => {
        document.body.removeChild(modal)
    })
    detailContainer.appendChild(closeButton)
    modal.appendChild(detailContainer)
    document.body.appendChild(modal);
}

//----------------------------------------------------------------------------------------------//

function addToWishlist(product) {
    if (!wishlist.some(item => item.productName === product.productName)) {
        wishlist.push(product);
        displayWishlist();
    }
}

function displayWishlist() {
    const wishlistItems = document.getElementById('wishlist-items');
    wishlistItems.innerHTML = ''; // Clear existing wishlist items
    wishlist.forEach(item => {
        const itemDiv = document.createElement('div');
        itemDiv.classList.add('card');
        itemDiv.innerHTML = `
            <h5>${item.productName}</h5>
            <p>$${item.price}</p>
            <button onclick="removeFromWishlist('${item.productName}')">Remove</button>
        `;
        wishlistItems.appendChild(itemDiv);
    });
}

function removeFromWishlist(productName) {
    wishlist = wishlist.filter(item => item.productName !== productName);
    displayWishlist();
}

//------------------------------------------------------------------------------------------------------//

function updateContent(){
    //onsole.log('udateContent: ', state, products.data)
    const productList = document.getElementById("products")
    while (productList.firstChild) {
        productList.removeChild(productList.firstChild)
    }
    
    const filteredProducts = products.data.filter(product => 
        ((state.category == 'All') || (product.category == state.category)) &&
        (state.searchTerm === '' || product.productName.toLocaleUpperCase().includes(state.searchTerm.toLocaleUpperCase())) &&
        (state.minPrice === '' || Number(product.price) >= Number(state.minPrice)) &&
        (state.maxPrice === '' || Number(product.price) <= Number(state.maxPrice)) 
    );
    for (let i of filteredProducts) {
        let card = createProduct(i)
        productList.appendChild(card);
    }    
}

function deleteProduct(productName) {
    products.data = products.data.filter(product => product.productName !== productName);
    
    state.category = "All"
    updateContent()
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


    state.category = category
    updateContent()
}

//--------------------------------------------------------------------------------------------------//
function filterProductsByPrice() {
    const minPrice = document.getElementById('min-price').value;
    const maxPrice = document.getElementById('max-price').value;
    
    state.minPrice = minPrice
    state.maxPrice = maxPrice
    updateContent()
}
//----------------------------------------------------------------------------------------------//
//searach button click
function filterProductBySearch() {
    let searchInput = document.getElementById("search-input").value.toLowerCase();

    state.searchTerm = searchInput
    updateContent()
}
//----------------------------------------------------------------------------------------------//

async function loadData(searchTerm) {
    const response = await fetch('/api/products/?search=' + encodeURIComponent(searchTerm));
    const data = await response.json()
    return data;
}

async function addNewProduct() {
    const response = await fetch('/api/products', {
        method: "POST",
        headers: {
/*          'Accept': 'application/json', */
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({

            //*productName: "Irem's Jacket",
            //*category:"Jacket",
            //*price: "240",
            //*image: "brown-jacket.jpg",    
        })
    })
    console.log('response', response.status, response.statusText)
    products = await loadData('');
    filterProductByCategory("All");
}
/*------------------------------------------------------------------------------------------*/

/*---------------------------------------------------------------------------------------------------*/

//initially display all products
window.onload = async () => {
    products = await loadData('');
    filterProductByCategory("All");

    //addNewProduct()
};