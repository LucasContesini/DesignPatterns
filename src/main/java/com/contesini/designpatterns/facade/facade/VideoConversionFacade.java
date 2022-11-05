package com.contesini.designpatterns.facade.facade;

import com.contesini.designpatterns.facade.media.AudioMixer;
import com.contesini.designpatterns.facade.media.BitrateReader;
import com.contesini.designpatterns.facade.media.Codec;
import com.contesini.designpatterns.facade.media.CodecFactory;
import com.contesini.designpatterns.facade.media.MPEG4CompressionCodec;
import com.contesini.designpatterns.facade.media.OggCompressionCodec;
import com.contesini.designpatterns.facade.media.VideoFile;
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
