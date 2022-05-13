package behavioural.observer.publisher

import behavioural.observer.listeners.EventListener


class ErrorManager {
    private var listeners: MutableList<EventListener> = mutableListOf()

    fun subscribe(listener: EventListener) = listeners.add(listener)

    fun unsubscribe(listener: EventListener) = listeners.remove(listener)

    fun notify(error: String) {
        listeners.forEach { it.update(error) }
    }
}