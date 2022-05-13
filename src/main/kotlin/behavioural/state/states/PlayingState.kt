package behavioural.state.states

import behavioural.state.context.MediaPlayer

class PlayingState(private val mediaPlayer: MediaPlayer) : State(mediaPlayer = mediaPlayer) {
    override fun onLock(): String {
        mediaPlayer.changeState(LockedState(mediaPlayer))
        mediaPlayer.setCurrentTrackAfterStop()
        return "Stop Playing"
    }

    override fun onPlay(): String {
        mediaPlayer.changeState(ReadyState(mediaPlayer))
        return "Paused"
    }

    override fun onNext(): String {
        return mediaPlayer.nextTrack()
    }

    override fun onPrevious(): String {
        return mediaPlayer.previousTrack()
    }
}