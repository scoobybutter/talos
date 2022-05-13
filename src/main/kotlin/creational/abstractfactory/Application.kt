package creational.abstractfactory

import creational.abstractfactory.buttons.Button
import creational.abstractfactory.checkboxes.Checkbox
import creational.abstractfactory.factories.GUIFactory

class Application(guiFactory: GUIFactory) {
    private val button: Button
    private val checkbox: Checkbox

    init {
        button = guiFactory.createButton()
        checkbox = guiFactory.createCheckbox()
    }

    fun paint() {
        button.paint()
        checkbox.paint()
    }
}