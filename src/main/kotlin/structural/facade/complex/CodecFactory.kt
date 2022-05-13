package structural.facade.complex

class CodecFactory {
    companion object {
        fun extract(file: VideoFile): Codec {
            if (file.codecType == CodecType.MP4) {
                println("CodecFactory: Extracting mpeg audio")
                return MP4Conversion()
            }
            println("CodecFactory: Extracting off audio")
            return OggConversion()
        }
    }
}