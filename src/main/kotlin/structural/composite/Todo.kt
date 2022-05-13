package structural.composite

class Todo(text: String) : TodoList {
    private val text: String

    init {
        this.text = text
    }

    override fun getHtml(): String {
        return text
    }
}