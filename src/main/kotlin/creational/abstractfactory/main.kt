package creational

import creational.abstractfactory.Application
import creational.abstractfactory.factories.MacFactory
import creational.abstractfactory.factories.WindowsFactory

fun main() {
    Application(WindowsFactory()).paint()
}