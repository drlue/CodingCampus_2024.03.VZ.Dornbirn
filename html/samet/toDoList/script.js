function addTask() {
  const taskInput = document.getElementById("taskInput");
  const taskList = document.getElementById("taskList");
  const taskDate = document.getElementById("taskDate");

  const li = document.createElement("li");
  li.innerHTML = `${taskInput.value} (am: ${taskDate.value})
    <button onclick="deleteTask(this)">Löschen</button>`;
  li.addEventListener("click", () => {
    li.classList.toggle("completed");
  });
  taskList.appendChild(li);
  taskInput.value = "";
  taskDate.value = "";
}

function deleteTask(button) {
  const li = button.parentElement;
  li.remove();
}
