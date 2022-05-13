package behavioural.observer

import behavioural.observer.listeners.EmailListener
import behavioural.observer.listeners.LogListener
import behavioural.observer.listeners.SlackListener
import behavioural.observer.publisher.ErrorManager

fun main() {
    val manager = ErrorManager()
    val emailListener = EmailListener()
    manager.subscribe(emailListener)
    manager.subscribe(LogListener())
    manager.subscribe(SlackListener())
    manager.notify("error in handling")
    println()
    manager.unsubscribe(emailListener)
    manager.notify("error not to be sent in email")
}