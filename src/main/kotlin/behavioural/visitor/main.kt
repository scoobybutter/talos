package behavioural.visitor

import behavioural.visitor.visitable.CircleShape
import behavioural.visitor.visitable.DotShape
import behavioural.visitor.visitor.XMLExportVisitor

fun main() {
    val shapes = listOf(DotShape(), CircleShape())
    val exporter = XMLExportVisitor()
    shapes.forEach { println(it.accept(exporter)) }
}