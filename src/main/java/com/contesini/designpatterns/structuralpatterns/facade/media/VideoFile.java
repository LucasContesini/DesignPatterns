package com.contesini.designpatterns.structuralpatterns.facade.media;

import lombok.Getter;

@Getter
public class VideoFile {

  private String name;
  private String codecType;

  public VideoFile(String name) {
    this.name = name;
    this.codecType = name.substring(name.indexOf(".") + 1);
  }
}
