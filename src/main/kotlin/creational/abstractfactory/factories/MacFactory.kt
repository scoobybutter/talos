package creational.abstractfactory.factories

import creational.abstractfactory.buttons.Button
import creational.abstractfactory.buttons.MacButton
import creational.abstractfactory.checkboxes.Checkbox
import creational.abstractfactory.checkboxes.MacCheckbox

class MacFactory: GUIFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacCheckbox()
    }
}