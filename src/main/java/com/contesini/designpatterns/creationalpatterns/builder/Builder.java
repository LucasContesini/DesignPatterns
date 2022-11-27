package com.contesini.designpatterns.creationalpatterns.builder;

public interface Builder {
  CarBuilder setSeats(int seats);
  CarBuilder setCarType(CarType carType);
  CarBuilder setColor(String color);
  void reset();
}
