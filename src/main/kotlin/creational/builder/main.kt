package creational.builder

fun main() {
    val foodOrder = FoodOrder.Builder()
        .bread("bread")
        .fish("fish")
        .condiments("condiments")
        .build()
    println(foodOrder.bread)
}