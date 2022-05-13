package behavioural.template

import behavioural.template.implementors.Book
import behavioural.template.implementors.User

fun main() {
    val user = User("test user")
    user.save()
    val book = Book("test book")
    book.save()
}