package behavioural.visitor.visitor

import behavioural.visitor.visitable.CircleShape
import behavioural.visitor.visitable.DotShape
import behavioural.visitor.visitable.Shape

class XMLExportVisitor: Visitor {
    override fun visit(shape: Shape): String {
        return "XML for shape"
    }

    override fun visit(dotShape: DotShape): String {
        return "XML for dot"
    }

    override fun visit(circleShape: CircleShape): String {
        return "XML for circle"
    }
}