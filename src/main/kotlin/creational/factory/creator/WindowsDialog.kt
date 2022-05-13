package creational.factory.creator

import creational.factory.product.Button
import creational.factory.product.WindowsButton

// Concrete Creator
class WindowsDialog: Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}