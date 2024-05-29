
//Global Variables
let inputTxt = '';
let updateIndex = '';

//get toDoList from local storage
let toDoArray = JSON.parse(localStorage.getItem('ToDoList'));
if (toDoArray === null) {
    toDoArray = [];
}

//Das aktuelle Datum als Voreinstellung setzen
document.querySelector("#inputDate").valueAsDate = new Date();

displayToDoList();

function addItem() {

    let inputTxt = document.querySelector("#inputBox").value;
    let inputDate = document.querySelector("#inputDate").value;
    console.log("1: " + inputTxt + " 2: " + inputDate);

    let inputItem = {
        text: inputTxt,
        date: inputDate,
        status: 'pending',
    }

    toDoArray.push(inputItem);
    localStorage.setItem('ToDoList', JSON.stringify(toDoArray));
    console.log(toDoArray);
    displayToDoList();
}

function removeItem(i) {
    resetInputContainer();
    toDoArray.splice(i, 1);
    localStorage.setItem('ToDoList', JSON.stringify(toDoArray));
    displayToDoList();

}

function editItem(i) {
    document.querySelector("#inputBox").value = toDoArray[i].text;
    updateIndex = i;
    console.log("updateIndex: " + updateIndex);
    //hide addButton
    document.querySelector(".addButton").style.display = 'none';
    //show updateButton
    document.querySelector(".updateButton").style.display = 'initial';
}

function updateItem() {
    //updateIndex globale variable in function editItem gesetzt
    console.log("updateIndex2: " + updateIndex);
    toDoArray[updateIndex].text = document.querySelector("#inputBox").value;
    console.log(toDoArray[updateIndex].text);
    document.querySelector(".addButton").style.display = 'initial';
    document.querySelector(".updateButton").style.display = 'none';

    localStorage.setItem('ToDoList', JSON.stringify(toDoArray));
    displayToDoList();

}

function changeItemStatus(i) {

    console.log(i);
    console.log(toDoArray);
    console.log(document.querySelectorAll(".checkBox")[i].checked);

    let dateElement = document.querySelectorAll(".toDoListDate")[i];
    let textElement = document.querySelectorAll(".toDoListText")[i];

    if (toDoArray[i].status === 'pending') {
        toDoArray[i].status = 'completed';
    } else {
        toDoArray[i].status = 'pending';
    }
    
    localStorage.setItem('ToDoList', JSON.stringify(toDoArray));
    console.log(toDoArray);
    displayToDoList();

}


function displayToDoList() {

    let itemsHTML = '';
    for (let i = 0; i < toDoArray.length; i++) {
        itemsHTML += `
        <div class="toDoListItem">
        <div class="toDoListCheckBox">
            <input type="checkbox" class="checkBox" onclick="changeItemStatus(${i})" ${(toDoArray[i].status === 'completed') ? "checked" : ""}>
            <span class="checkmark"></span>
        </div>
        <div class="toDoListDate ${(toDoArray[i].status === 'completed') ? "completed" : ""}  ">${toDoArray[i].date}</div>
        <div class="toDoListText ${(toDoArray[i].status === 'completed') ? "completed" : ""}">${toDoArray[i].text}</div>
        <div><button class="deleteButton" onclick="removeItem(${i})">Delete</button></div>
        <div><button class="editButton" onclick="editItem(${i})">Edit</button></div>
        </div>
        `
    }

    document.querySelector('#toDoList').innerHTML = itemsHTML;
}


function sortItemsDate() {
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        toDoArray.sort(function (a, b) {
            // Turn your strings into dates, and then subtract them
            // to get a value that is either negative, positive, or zero.
            return new Date(b.date) - new Date(a.date);
        });
        sortDirection = 'desc';
    } else {
        toDoArray.sort(function (a, b) {
            return new Date(a.date) - new Date(b.date);
        });
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    displayToDoList();
}

function sortItemsText() {
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        toDoArray.sort((a, b) => a.text.localeCompare(b.text))
        sortDirection = 'desc';
    } else {
        toDoArray.sort((a, b) => b.text.localeCompare(a.text))
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    displayToDoList();
}

function sortItemsStatus() {
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        toDoArray.sort((a, b) => a.status.localeCompare(b.status))
        sortDirection = 'desc';
    } else {
        toDoArray.sort((a, b) => b.status.localeCompare(a.status))
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    displayToDoList();
}



function validateInput() {
    let btn = document.querySelector(".addButton");
    let inputBox = document.querySelector("#inputBox");
    if (inputBox.value === '') {
        btn.disabled = true;
    } else {
        btn.disabled = false;
    }
}

function clearInputText() {
    document.querySelector("#inputBox").value = '';
}

function resetInputContainer() {
    clearInputText();
    document.querySelector(".addButton").style.display = 'initial';
    document.querySelector(".updateButton").style.display = 'none';
}



