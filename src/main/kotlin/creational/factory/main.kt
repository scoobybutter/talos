package creational.factory

import creational.factory.creator.HtmlDialog
import creational.factory.creator.WindowsDialog

fun main() {
    WindowsDialog().renderDisplay()
    HtmlDialog().renderDisplay()
}