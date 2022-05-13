package behavioural.visitor.visitable

import behavioural.visitor.visitor.Visitor

class DotShape: Shape {
    override fun draw() {
        TODO("Not yet implemented")
    }

    override fun accept(visitor: Visitor): String {
        return visitor.visit(this)
    }
}