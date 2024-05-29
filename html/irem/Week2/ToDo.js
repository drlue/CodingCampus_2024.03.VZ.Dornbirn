document.addEventListener('DOMContentLoaded', loadTasks);

function deleteAllToDoItems(){
    document.getElementById("taskList").innerHTML = ""
    saveTasks()
}


// Funktion zum Hinzufügen einer neuen Aufgabe var steht für variable li steht für list 
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
    document.addEventListener('DOMContentLoaded', function() {
        document.querySelector('button').onclick = addTask;
        loadTasks();
    });
    document.addEventListener('DOMContentLoaded', function() {
        document.getElementById('addTaskBtn').addEventListener('click', addTask);
        document.getElementById('clearAllBtn').addEventListener('click', clearAllTasks);
        loadTasks();
    });
    
    /*
    function addTask() {
        var input = document.getElementById("taskInput");
        if (input.value.trim() === '') {
            alert("Bitte geben Sie eine Aufgabe ein.");
            return;
        }
        var li = document.createElement("li");
        li.textContent = input.value;
        li.onclick = function() {
            this.parentNode.removeChild(this);
            saveTasks();
        };
        document.getElementById("taskList").appendChild(li);
        input.value = ""; 
        saveTasks();
    }
    
    function clearAllTasks() {
        var taskList = document.getElementById("taskList");
        while (taskList.firstChild) {
            taskList.removeChild(taskList.firstChild);
        }
        saveTasks();
    }
    
    function saveTasks() {
        var tasks = [];
        var taskList = document.querySelectorAll("#taskList li");
        taskList.forEach(function(task) {
            tasks.push(task.textContent);
        });
        localStorage.setItem('tasks', JSON.stringify(tasks));
    }
    
    function loadTasks() {
        var tasks = JSON.parse(localStorage.getItem('tasks'));
        if (tasks) {
            tasks.forEach(function(taskContent) {
                var li = document.createElement("li");
                li.textContent = taskContent;
                li.onclick = function() {
                    this.parentNode.removeChild(this);
                    saveTasks();
                };
                document.getElementById("taskList").appendChild(li);
            });
        }
    }
    document.addEventListener('DOMContentLoaded', function() {
        document.getElementById('addTaskBtn').addEventListener('click', addTask);
        document.getElementById('clearAllBtn').addEventListener('click', clearAllTasks);
        loadTasks();
    });
    
    function addTask() {
        var input = document.getElementById("taskInput");
        var dueDate = document.getElementById("dueDate");
        if (input.value.trim() === '') {
            alert("Bitte geben Sie eine Aufgabe ein.");
            return;
        }
        var li = document.createElement("li");
        li.textContent = input.value + " - fällig am: " + dueDate.value;
        li.onclick = function() {
            this.classList.toggle('completed');
        };
        document.getElementById("taskList").appendChild(li);
        input.value = "";
        dueDate.value = ""; // Datumseingabe zurücksetzen
        saveTasks();
    }
    
    function saveTasks() {
       
    }
    
    function loadTasks() {
        
    }
    
    */
    
}

