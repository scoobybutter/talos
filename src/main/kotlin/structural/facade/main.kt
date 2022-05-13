package structural.facade

import structural.facade.complex.CodecType
import structural.facade.facade.VideoConversionFacade

fun main() {
    val facade = VideoConversionFacade()
    facade.convertVideo("test", CodecType.MP4)
}