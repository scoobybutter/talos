package creational.abstractfactory.factories

import creational.abstractfactory.buttons.Button
import creational.abstractfactory.checkboxes.Checkbox

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}