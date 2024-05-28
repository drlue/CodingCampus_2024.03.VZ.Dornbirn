document.addEventListener('DOMContentLoaded', loadTasks);

// Funktion zum Hinzufügen einer neuen Aufgabe
function addTask() {
    var input = document.getElementById("taskInput");
    if(input.value.trim() !== '') {
        var li = document.createElement("li");
        li.textContent = input.value;
        li.onclick = function() {
            this.parentNode.removeChild(this);
            saveTasks(); 
        }
        document.getElementById("taskList").appendChild(li);
        input.value = ""; 
        saveTasks(); // Speichern jedes Mal, wenn eine neue Aufgabe hinzugefügt wird
    }
}

// Speichert alle Aufgaben in localStorage
function saveTasks() {
    var tasks = [];
    document.querySelectorAll("#taskList li").forEach(function(task){
        tasks.push(task.textContent);
    });
    localStorage.setItem('tasks', JSON.stringify(tasks));
}

// Lädt die gespeicherten Aufgaben beim Start
function loadTasks() {
    var tasks = JSON.parse(localStorage.getItem('tasks'));
    if(tasks) {
        tasks.forEach(function(task){
            var li = document.createElement("li");
            li.textContent = task;
            li.onclick = function() {
                this.parentNode.removeChild(this);
                saveTasks(); 
            }
            document.getElementById("taskList").appendChild(li);
        });
    }
}

