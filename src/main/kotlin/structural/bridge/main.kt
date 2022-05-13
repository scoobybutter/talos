package structural.bridge

import structural.bridge.abstractions.LongFormView
import structural.bridge.abstractions.ShortFormView
import structural.bridge.implementors.Artist
import structural.bridge.implementors.ArtistResource
import structural.bridge.implementors.Book
import structural.bridge.implementors.BookResource

fun main() {
    println(LongFormView(BookResource(Book("test book"))).show())
    println(LongFormView(ArtistResource(Artist("test author"))).show())
    println(ShortFormView(ArtistResource(Artist("test author"))).show())
}