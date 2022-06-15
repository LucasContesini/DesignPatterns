package com.contesini.designpatterns.abstractfactory.sofa;

public class ModernSofa implements Sofa {

  @Override
  public void hasLegs() {
    System.out.println("It has 2 legs");
  }

  @Override
  public void sitOn() {
    System.out.println("You sat on a modern sofa");
  }

  @Override
  public void layOn() {
    System.out.println("You lay on a modern sofa");
  }
}
