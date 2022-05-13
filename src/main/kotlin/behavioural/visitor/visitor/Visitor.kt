package behavioural.visitor.visitor

import behavioural.visitor.visitable.CircleShape
import behavioural.visitor.visitable.DotShape
import behavioural.visitor.visitable.Shape

interface Visitor {
    fun visit(shape: Shape): String
    fun visit(dotShape: DotShape): String
    fun visit(circleShape: CircleShape): String
}