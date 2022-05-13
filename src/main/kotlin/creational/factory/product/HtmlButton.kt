package creational.factory.product

// Concrete Product
class HtmlButton: Button {
    override fun render() {
        println("Button render done")
    }
}