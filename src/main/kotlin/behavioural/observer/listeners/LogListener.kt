package behavioural.observer.listeners

class LogListener: EventListener {
    override fun update(data: String) {
        println("logging $data")
    }
}