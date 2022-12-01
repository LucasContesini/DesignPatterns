package com.contesini.designpatterns.behavioralpatterns.mediator.components;

import com.contesini.designpatterns.behavioralpatterns.mediator.mediator.Mediator;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class SaveButton extends JButton implements Component {

  private Mediator mediator;

  public SaveButton() {
    super("Save");
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void fireActionPerformed(ActionEvent actionEvent) {
    mediator.saveChanges();
  }

  @Override
  public String getName() {
    return "SaveButton";
  }
}