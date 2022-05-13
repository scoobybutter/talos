package structural.bridge.abstractions

import structural.bridge.implementors.Resource

class ShortFormView(resource: Resource) : View(resource) {
    override fun show(): String {
        return "showing ${resource.getSnippet()} in short form"
    }
}