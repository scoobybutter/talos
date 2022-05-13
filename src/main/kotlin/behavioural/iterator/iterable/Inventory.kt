package behavioural.iterator.iterable

import behavioural.iterator.iterator.InventoryIterator

interface Inventory {
    fun getInventoryIterator(): InventoryIterator
}