package behavioural.nullobject

fun main() {
    val animals = listOf(Dog(), NoAnimal())
    animals.forEach { it.speak() }
}