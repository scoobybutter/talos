package behavioural.state.states

import behavioural.state.context.MediaPlayer

abstract class State(private val mediaPlayer: MediaPlayer) {
    abstract fun onLock(): String
    abstract fun onPlay(): String
    abstract fun onNext(): String
    abstract fun onPrevious(): String
}