package behavioural.iterator.iterable

import behavioural.iterator.iterator.HandheldInventoryIterator
import behavioural.iterator.iterator.InventoryIterator

class HandheldInventory(left: InventoryItem, right: InventoryItem) : Inventory {
    val left: InventoryItem
    val right: InventoryItem

    init {
        this.left = left
        this.right = right
    }

    override fun getInventoryIterator(): InventoryIterator {
        return HandheldInventoryIterator(this)
    }

}