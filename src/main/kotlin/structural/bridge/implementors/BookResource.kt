package structural.bridge.implementors

class BookResource(book: Book) : Resource {
    private val book: Book

    init {
        this.book = book
    }

    override fun getSnippet(): String {
        return book.title
    }
}