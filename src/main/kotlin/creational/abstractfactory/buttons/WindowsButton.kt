package creational.abstractfactory.buttons

class WindowsButton: Button {
    override fun paint() {
        println("Windows button painted")
    }
}