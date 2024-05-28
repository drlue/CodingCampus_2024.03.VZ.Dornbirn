class Entry{
    constructor(toDoString, toDoDate){
        this.toDoString = toDoString;
        this.toDoDate = toDoDate;
    }

    printDataClass(){
        document.querySelector('.toDoList').innerHTML = 
        `
        <div class="toDoString"> ${this.toDoString}</div>
        <div class="toDoDate"> ${this.toDoDate}</div>

        `
    }
}