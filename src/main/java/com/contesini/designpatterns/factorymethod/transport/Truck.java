package com.contesini.designpatterns.factorymethod.transport;

public class Truck implements Transport {

  @Override
  public void deliver() {
    System.out.println("Delivering cargo by land");
  }
}