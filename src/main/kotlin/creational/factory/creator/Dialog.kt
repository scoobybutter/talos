package creational.factory.creator

import creational.factory.product.Button

// Creator
abstract class Dialog {
    abstract fun createButton(): Button

    fun renderDisplay() {
        val button = createButton()
        button.render()
    }
}