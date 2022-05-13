package behavioural.state.states

import behavioural.state.context.MediaPlayer

class ReadyState(private val mediaPlayer: MediaPlayer) : State(mediaPlayer) {
    override fun onLock(): String {
        mediaPlayer.changeState(LockedState(mediaPlayer))
        return "Locked.."
    }

    override fun onPlay(): String {
        val action = mediaPlayer.startPlayback()
        mediaPlayer.changeState(PlayingState(mediaPlayer))
        return action
    }

    override fun onNext(): String {
        return "Locked.."
    }

    override fun onPrevious(): String {
        return "Locked.."
    }
}