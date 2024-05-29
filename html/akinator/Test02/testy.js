function addTodo() {
    const todoInput = document.getElementById('todoInput');
    const todoList = document.getElementById('todoList');
    
    if (todoInput.value.trim() !== '') {
        const li = document.createElement('li');
        li.textContent = todoInput.value;
        todoList.appendChild(li);
        todoInput.value = '';
    } else {
        alert('Bitte geben Sie eine Aufgabe ein.');
    }
}