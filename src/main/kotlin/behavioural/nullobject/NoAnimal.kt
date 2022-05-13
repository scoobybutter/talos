package behavioural.nullobject

class NoAnimal: Animal() {
    override fun speak() {
        // Do nothing
        return
    }
}