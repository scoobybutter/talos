package behavioural.state.states

import behavioural.state.context.MediaPlayer

class LockedState(private val mediaPlayer: MediaPlayer): State(mediaPlayer) {
    override fun onLock(): String {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.changeState(ReadyState(mediaPlayer))
            return "Stop Playing"
        }
        return "Locked.."
    }

    override fun onPlay(): String {
        mediaPlayer.changeState(ReadyState(mediaPlayer))
        return "Ready"
    }

    override fun onNext(): String {
        return "Locked.."
    }

    override fun onPrevious(): String {
        return "Locked.."
    }
}