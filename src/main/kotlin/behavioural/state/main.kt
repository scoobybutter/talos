package behavioural.state

import behavioural.state.context.MediaPlayer
import behavioural.state.context.UI

fun main() {
    val ui = UI(MediaPlayer())
    ui.init()
}