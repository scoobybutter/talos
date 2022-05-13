package behavioural.iterator

import behavioural.iterator.iterable.HandheldInventory
import behavioural.iterator.iterable.InventoryItem

fun main() {
    val handheldInventory = HandheldInventory(InventoryItem("left"), InventoryItem("right"))
    val handheldInventoryIter = handheldInventory.getInventoryIterator()
    println(handheldInventoryIter.hasNext())
    println(handheldInventoryIter.getCurrentInventory().title)
    handheldInventoryIter.next()
    println(handheldInventoryIter.getCurrentInventory().title)
    handheldInventoryIter.next()
    println(handheldInventoryIter.getCurrentInventory().title)
}