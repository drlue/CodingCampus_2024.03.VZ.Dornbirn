
//Global Variables
let inputTxt = '';
let updateIndex = '';

//get toDoList from local storage
let toDoArray = JSON.parse(localStorage.getItem('ToDoList'));
if (toDoArray === null){
    toDoArray = [];
}

//Das aktuelle Datum als Voreinstellung setzen
document.querySelector("#inputDate").valueAsDate = new Date();

displayToDoList();

function addItem(){
    
    let inputTxt = document.querySelector("#inputBox").value;
    let inputDate = document.querySelector("#inputDate").value;
    console.log("1: "+ inputTxt + " 2: " + inputDate);

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
    
    if(document.querySelectorAll(".checkBox")[i].checked) {
        console.log(document.querySelectorAll(".toDoListText")[i]);
        document.querySelectorAll(".toDoListDate")[i].style.textDecoration = "line-through";
        document.querySelectorAll(".toDoListText")[i].style.textDecoration = "line-through";
        toDoArray[i].status = 'completed';
    } else {
        document.querySelectorAll(".toDoListDate")[i].style.textDecoration = "none";
        document.querySelectorAll(".toDoListText")[i].style.textDecoration = "none";
        toDoArray[i].status = 'pending';
    }
    localStorage.setItem('ToDoList', JSON.stringify(toDoArray));
    //displayToDoList();

}


function displayToDoList() {

    let itemsHTML = '';
    for(let i=0; i < toDoArray.length; i++) {
        itemsHTML += `
        <div class="toDoListItem">
        <div class="toDoListCheckBox"><input type="checkbox" class="checkBox" onclick="changeItemStatus(${i})"></div>
        <div class="toDoListDate">${toDoArray[i].date}</div>
        <div class="toDoListText">${toDoArray[i].text}</div>
        <div><button class="deleteButton" onclick="removeItem(${i})">Delete</button></div>
        <div><button class="editButton" onclick="editItem(${i})">Edit</button></div>
        </div>
        `
    }

    document.querySelector('#toDoList').innerHTML = itemsHTML;
}


function sortItems(){
let sortDirection = localStorage.getItem('SortDirection');
if (sortDirection === 'asc') {

    toDoArray.sort(function(a,b){
        // Turn your strings into dates, and then subtract them
        // to get a value that is either negative, positive, or zero.
        return new Date(b.date) - new Date(a.date);
      });
      sortDirection ='desc';
    } else {
        toDoArray.sort(function(a,b){
            return new Date(a.date) - new Date(b.date);
          });
          sortDirection = 'asc' 
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    displayToDoList();

}

function validateInput(){
let btn = document.querySelector(".addButton");
let inputBox = document.querySelector("#inputBox");
    if(inputBox.value === '') {
        btn.disabled = true;
    } else {
        btn.disabled = false;
    }
}



