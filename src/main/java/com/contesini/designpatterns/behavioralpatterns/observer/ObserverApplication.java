package com.contesini.designpatterns.behavioralpatterns.observer;

import com.contesini.designpatterns.behavioralpatterns.observer.editor.Editor;
import com.contesini.designpatterns.behavioralpatterns.observer.listeners.EmailNotificationListener;
import com.contesini.designpatterns.behavioralpatterns.observer.listeners.LogOpenListener;

public class ObserverApplication {

  public static void main(String[] args) {
    var editor = new Editor();
    editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
    editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

    try {
      editor.openFile("test.txt");
      editor.saveFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
