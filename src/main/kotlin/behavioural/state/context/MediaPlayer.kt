package behavioural.state.context

import behavioural.state.states.ReadyState
import behavioural.state.states.State

class MediaPlayer {
    private var state: State
    private var playing = false
    private var currentTrack = 0
    private val playList = listOf("track 1", "track 2", "track 3")

    init {
        state = ReadyState(this)
    }

    fun changeState(state: State) {
        this.state = state
    }

    fun getState() = this.state

    fun setPlaying(playing: Boolean) {
        this.playing = playing
    }

    fun isPlaying() = this.playing

    fun startPlayback(): String {
        return "Playing ${playList[currentTrack]}"
    }

    fun nextTrack(): String {
        currentTrack++;
        if (currentTrack > playList.size - 1) {
            currentTrack = 0;
        }
        return startPlayback()
    }

    fun previousTrack(): String {
        currentTrack--
        if (currentTrack < 0) {
            currentTrack = playList.size - 1
        }
        return startPlayback()
    }

    fun setCurrentTrackAfterStop() {
        currentTrack = 0
    }
}