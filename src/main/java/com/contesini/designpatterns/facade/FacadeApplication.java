package com.contesini.designpatterns.facade;

import com.contesini.designpatterns.facade.facade.VideoConversionFacade;

public class FacadeApplication {

  public static void main(String[] args) {
    var converter = new VideoConversionFacade();
    var mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");

  }
}
