package com.contesini.designpatterns.behavioralpatterns.mediator;

import com.contesini.designpatterns.behavioralpatterns.mediator.components.AddButton;
import com.contesini.designpatterns.behavioralpatterns.mediator.components.DeleteButton;
import com.contesini.designpatterns.behavioralpatterns.mediator.components.Filter;
import com.contesini.designpatterns.behavioralpatterns.mediator.components.List;
import com.contesini.designpatterns.behavioralpatterns.mediator.components.SaveButton;
import com.contesini.designpatterns.behavioralpatterns.mediator.components.TextBox;
import com.contesini.designpatterns.behavioralpatterns.mediator.components.Title;
import com.contesini.designpatterns.behavioralpatterns.mediator.mediator.Editor;
import com.contesini.designpatterns.behavioralpatterns.mediator.mediator.Mediator;
import javax.swing.DefaultListModel;

public class MediatorApplication {

  public static void main(String[] args) {
    Mediator mediator = new Editor();

    mediator.registerComponent(new Title());
    mediator.registerComponent(new TextBox());
    mediator.registerComponent(new AddButton());
    mediator.registerComponent(new DeleteButton());
    mediator.registerComponent(new SaveButton());
    mediator.registerComponent(new List(new DefaultListModel()));
    mediator.registerComponent(new Filter());

    mediator.createGUI();
  }
}
