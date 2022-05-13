package structural.facade.complex

class BitRateReader {
    companion object {
        fun read(file: VideoFile, codec: Codec): VideoFile {
            println("BitRateReader: reading file")
            return file
        }

        fun convert(file: VideoFile, codec: Codec): VideoFile {
            println("BitRateReader: converting file")
            return file
        }
    }
}