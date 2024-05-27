function addTask(){
    var input = document.getElementById("task Input");
    if (input.value.trim()!== ''){
        var li= document.createElement("li");
        li.textContent = input.value;
        li.onclick = function (){
            
        }
    }

}