package structural.bridge.abstractions

import structural.bridge.implementors.Resource

abstract class View(resource: Resource) {
    val resource: Resource
    init {
        this.resource = resource
    }
    abstract fun show(): String
}