package structural.facade.complex

data class VideoFile(
    val name: String,
    val codecType: CodecType
)

enum class CodecType {
    MP4,
    OGG
}
