package com.contesini.designpatterns.abstractfactory.chair;

public class OldChair implements Chair {

  @Override
  public void hasLegs() {
    System.out.println("It has 4 legs");
  }

  @Override
  public void sitOn() {
    System.out.println("You sat on an old chair");
  }
}
