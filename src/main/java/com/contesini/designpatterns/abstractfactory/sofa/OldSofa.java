package com.contesini.designpatterns.abstractfactory.sofa;

public class OldSofa implements Sofa {

  @Override
  public void hasLegs() {
    System.out.println("It has 4 legs");
  }

  @Override
  public void sitOn() {
    System.out.println("You sat on an old sofa");
  }

  @Override
  public void layOn() {
    System.out.println("You lay on an old sofa");
  }
}
