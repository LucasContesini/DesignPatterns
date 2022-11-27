package com.contesini.designpatterns.creationalpatterns.abstractfactory.chair;

public class ModernChair implements Chair {

  @Override
  public void hasLegs() {
    System.out.println("It has 1 leg");
  }

  @Override
  public void sitOn() {
    System.out.println("You sat on a modern chair");
  }
}
