package com.contesini.designpatterns.behavioralpatterns.mediator.mediator;

import lombok.Data;

@Data
public class Note {

  private String name;
  private String text;

  public Note() {
    name = "New note";
  }
}