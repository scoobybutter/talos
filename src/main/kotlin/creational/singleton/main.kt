package creational.singleton

fun main() {
    val firstInstance = Singleton.instance
    val secondInstance = Singleton.instance
    println(firstInstance == secondInstance)
}