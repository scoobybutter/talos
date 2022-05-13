package structural.composite

fun main() {
    val todo = Project("test", listOf(Todo("task1"), Todo("task2"), Project("test2", listOf(Todo("task3")))))
    println(todo.getHtml())
}