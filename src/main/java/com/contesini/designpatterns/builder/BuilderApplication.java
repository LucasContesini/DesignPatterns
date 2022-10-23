package com.contesini.designpatterns.builder;

public class BuilderApplication {

  public static void main(String[] args) {
    var builder = new CarBuilder();

    var hatchCar = createHatchCar(builder, 4, CarType.HATCH, "Black");
    printCar(hatchCar);

    var sedanCar = createSedanCar(builder, 2, CarType.SEDAN, "White");
    printCar(sedanCar);

    var suvCar = createSUVCar(builder, 3, CarType.SUV);
    printCar(suvCar);
  }

  private static Car createHatchCar(CarBuilder builder, int seats, CarType carType, String color) {
    builder.reset();
    return builder
        .setSeats(seats)
        .setCarType(carType)
        .setColor(color)
        .getCar();
  }

  private static Car createSedanCar(CarBuilder builder, int seats, CarType carType, String color) {
    builder.reset();
    return builder
        .setSeats(seats)
        .setCarType(carType)
        .setColor(color)
        .getCar();
  }

  private static Car createSUVCar(CarBuilder builder, int seats, CarType carType) {
    builder.reset();
    return builder
        .setSeats(seats)
        .setCarType(carType)
        .getCar();
  }

  private static void printCar(Car car) {
    System.out.println(car);
  }
}
