package behavioural.iterator.iterator

import behavioural.iterator.iterable.InventoryItem

interface InventoryIterator {
    fun hasNext(): Boolean
    fun next()
    fun getCurrentInventory(): InventoryItem
}