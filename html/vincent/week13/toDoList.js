function addNewElement(){
    
        var li = document.createElement("li");
        var inputValue = document.getElementById("myInput").value;
        var t = document.createTextNode(inputValue);
        li.appendChild(t);
        if (inputValue === '') {
          alert("Please add a meaningfull task that will help you to improve...!");
        } else {
          document.getElementById("myUL").appendChild(li);
        }
        document.getElementById("myInput").value = "";
      
        var span = document.createElement("SPAN");
        var txt = document.createTextNode("\u00D7");
        span.className = "close";
        span.appendChild(txt);
        li.appendChild(span);
      
        for (i = 0; i < close.length; i++) {
          close[i].onclick = function() {
            var div = this.parentElement;
            div.style.display = "none";
          }
        }
}
document.addEventListener('DOMContentLoaded', function(){
let list = document.getElementById('myUL');
list.addEventListener("click", function(ev){
    if(ev.target.tagName ==='LI'){
        ev.target.classList.toggle("checked");
    }
},false);
});
// function deleteItems(){
//     const deleteElm = document.createElement('button');
//     let list = document.getElementById('myUL');
//     list.innerHTML = Text

//     list.appendChild(deleteElm)

    
// }