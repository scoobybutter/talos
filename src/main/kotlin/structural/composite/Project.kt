package structural.composite

class Project(title: String, todoItems: List<TodoList>) : TodoList {
    private val title: String
    private val todoItems: List<TodoList>

    init {
        this.title = title
        this.todoItems = todoItems
    }

    override fun getHtml(): String {
        return "<h1>$title</h1> <ul> ${todoItems.joinToString("") { "<li> ${it.getHtml()} </li>" }} </ul>"
    }
}