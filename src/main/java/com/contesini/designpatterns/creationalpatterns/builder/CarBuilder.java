package com.contesini.designpatterns.creationalpatterns.builder;

public class CarBuilder implements Builder {

  private int seats;
  private CarType carType;
  private String color;

  @Override
  public CarBuilder setSeats(int seats) {
    this.seats = seats;
    return this;
  }

  @Override
  public CarBuilder setCarType(CarType carType) {
    this.carType = carType;
    return this;
  }

  @Override
  public CarBuilder setColor(String color) {
    this.color = color;
    return this;
  }

  @Override
  public void reset() {
    this.seats = 0;
    this.carType = null;
    this.color = "";
  }

  public Car getCar() {
    return new Car(seats, carType, color);
  }
}
