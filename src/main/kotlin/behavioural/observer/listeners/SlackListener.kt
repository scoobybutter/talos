package behavioural.observer.listeners

class SlackListener: EventListener {
    override fun update(data: String) {
        println("sending slack message for $data")
    }
}