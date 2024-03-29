package com.contesini.designpatterns.structuralpatterns.facade.facade;

import com.contesini.designpatterns.structuralpatterns.facade.media.AudioMixer;
import com.contesini.designpatterns.structuralpatterns.facade.media.BitrateReader;
import com.contesini.designpatterns.structuralpatterns.facade.media.Codec;
import com.contesini.designpatterns.structuralpatterns.facade.media.CodecFactory;
import com.contesini.designpatterns.structuralpatterns.facade.media.MPEG4CompressionCodec;
import com.contesini.designpatterns.structuralpatterns.facade.media.OggCompressionCodec;
import com.contesini.designpatterns.structuralpatterns.facade.media.VideoFile;
import java.io.File;

public class VideoConversionFacade {

  public File convertVideo(String fileName, String format) {
    System.out.println("VideoConversionFacade: conversion started.");
    var file = new VideoFile(fileName);
    var sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec;
    if (format.equals("mp4")) {
      destinationCodec = new MPEG4CompressionCodec();
    } else {
      destinationCodec = new OggCompressionCodec();
    }
    var buffer = BitrateReader.read(file, sourceCodec);
    var intermediateResult = BitrateReader.convert(buffer, destinationCodec);
    var result = (new AudioMixer()).fix(intermediateResult);
    System.out.println("VideoConversionFacade: conversion completed.");
    return result;
  }
}
