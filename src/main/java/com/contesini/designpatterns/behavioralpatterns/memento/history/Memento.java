package com.contesini.designpatterns.behavioralpatterns.memento.history;

import com.contesini.designpatterns.behavioralpatterns.memento.editor.Editor;

public class Memento {

  private String backup;
  private Editor editor;

  public Memento(Editor editor) {
    this.editor = editor;
    this.backup = editor.backup();
  }

  public void restore() {
    editor.restore(backup);
  }
}
