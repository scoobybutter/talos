package creational.abstractfactory.factories

import creational.abstractfactory.buttons.Button
import creational.abstractfactory.buttons.WindowsButton
import creational.abstractfactory.checkboxes.Checkbox
import creational.abstractfactory.checkboxes.WindowsCheckbox

class WindowsFactory: GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}