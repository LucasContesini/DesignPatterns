package com.contesini.designpatterns.behavioralpatterns.state;

import com.contesini.designpatterns.behavioralpatterns.state.ui.Player;
import com.contesini.designpatterns.behavioralpatterns.state.ui.UI;

public class StateApplication {

  public static void main(String[] args) {
    var player = new Player();
    var ui = new UI(player);
    ui.init();
  }
}
