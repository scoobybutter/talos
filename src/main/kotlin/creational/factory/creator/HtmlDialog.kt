package creational.factory.creator

import creational.factory.product.Button
import creational.factory.product.HtmlButton

// Concrete Creator
class HtmlDialog: Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}