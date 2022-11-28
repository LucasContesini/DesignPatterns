package com.contesini.designpatterns.behavioralpatterns.command;

import com.contesini.designpatterns.behavioralpatterns.command.editor.Editor;

public class CommandApplication {

  public static void main(String[] args) {
    var editor = new Editor();
    editor.init();
  }
}
