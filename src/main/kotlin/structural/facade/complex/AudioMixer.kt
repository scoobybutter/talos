package structural.facade.complex

import java.io.File

class AudioMixer {
    companion object {
        fun fix(videoFile: VideoFile): File {
            println("AudioMixer: fixing audio")
            return File("temp")
        }
    }
}