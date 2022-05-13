package structural.facade.facade

import structural.facade.complex.*
import java.io.File

class VideoConversionFacade {
    fun convertVideo(fileName: String, format: CodecType): File {
        println("VideoConversionFacade: conversion started")
        var videoFile = VideoFile(fileName, format)
        val codec = CodecFactory.extract(videoFile)
        videoFile = BitRateReader.read(videoFile, codec)
        videoFile = BitRateReader.convert(videoFile, codec)
        val result = AudioMixer.fix(videoFile)
        println("VideoConversionFacade: conversion completed")
        return result
    }
}