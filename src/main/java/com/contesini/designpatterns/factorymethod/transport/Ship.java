package com.contesini.designpatterns.factorymethod.transport;

public class Ship implements Transport {

  @Override
  public void deliver() {
    System.out.println("Delivering cargo by sea");
  }
}
