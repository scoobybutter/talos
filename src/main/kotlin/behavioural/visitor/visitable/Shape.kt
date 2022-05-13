package behavioural.visitor.visitable

import behavioural.visitor.visitor.Visitor

interface Shape {
    fun draw()
    fun accept(visitor: Visitor): String
}