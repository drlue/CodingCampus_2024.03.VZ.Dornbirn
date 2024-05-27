function addTask() {
    const taskInput = document.getElementById('taskInput');
    const taskList = document.getElementById('taskList');
    
    if (taskInput.value.trim() !== "") {
        const li = document.createElement('li');
        li.innerHTML = `
            ${taskInput.value}
            <button onclick="deleteTask(this)">Löschen</button>
        `;
        li.addEventListener('click', () => {
            li.classList.toggle('completed');
        });
        taskList.appendChild(li);
        taskInput.value = "";
    } else {
        alert("Bitte eine Aufgabe eingeben.");
    }
}

function deleteTask(button) {
    const li = button.parentElement;
    li.remove();
}








