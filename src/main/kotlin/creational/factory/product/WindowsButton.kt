package creational.factory.product

// Concrete Product
class WindowsButton: Button {
    override fun render() {
        println("Windows render done")
    }
}