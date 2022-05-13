package behavioural.observer.listeners

class EmailListener: EventListener {
    override fun update(data: String) {
        println("sending email for $data")
    }
}