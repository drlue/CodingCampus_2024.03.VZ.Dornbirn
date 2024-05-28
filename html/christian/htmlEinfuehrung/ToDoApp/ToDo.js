let ListOfEntries = [];

function addEntry(){
       let toDoStr = document.querySelector('#textInput').value;
       let toDoDate = document.querySelector('#dateInput').value;     

    let entry =  new Entry(toDoStr,toDoDate)
    
    console.log(entry);
    ListOfEntries.push(entry);
    console.log(ListOfEntries);
    saveData(ListOfEntries);
}

function saveData(ListOfEntries){

    localStorage.setItem('EntryArray',JSON.stringify(ListOfEntries));
}


function printData(){
    ListOfEntries = JSON.parse(localStorage.getItem('EntryArray'))
    console.log(ListOfEntries)
    for(let i =0;i<ListOfEntries.length;i++){
        console.log(ListOfEntries[i].toDoString, ListOfEntries[i].toDoDate)
    }
}
