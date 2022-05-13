package behavioural.iterator.iterator

import behavioural.iterator.iterable.HandheldInventory
import behavioural.iterator.iterable.InventoryItem

class HandheldInventoryIterator(handheldInventory: HandheldInventory) : InventoryIterator {
    private val handheldInventory: HandheldInventory
    private var index: Int = 0

    init {
        this.handheldInventory = handheldInventory
    }

    override fun hasNext(): Boolean {
        return index in 0..1
    }

    override fun next() {
        index = index.xor(1)
    }

    override fun getCurrentInventory(): InventoryItem {
        if (index == 0) return handheldInventory.left
        return handheldInventory.right
    }
}