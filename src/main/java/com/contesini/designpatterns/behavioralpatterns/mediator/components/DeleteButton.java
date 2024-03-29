package com.contesini.designpatterns.behavioralpatterns.mediator.components;

import com.contesini.designpatterns.behavioralpatterns.mediator.mediator.Mediator;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class DeleteButton extends JButton implements Component {

  private Mediator mediator;

  public DeleteButton() {
    super("Del");
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  protected void fireActionPerformed(ActionEvent actionEvent) {
    mediator.deleteNote();
  }

  @Override
  public String getName() {
    return "DelButton";
  }
}