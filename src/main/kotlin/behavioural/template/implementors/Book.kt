package behavioural.template.implementors

class Book(book: String) : behavioural.template.base.Record() {
    private val book: String

    init {
        this.book = book
    }

    override fun getData(): String {
        return book
    }

    override fun onSaved() {
        println("$book saved")
    }
}