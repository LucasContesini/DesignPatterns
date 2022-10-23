package com.contesini.designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Car {

  private int seats;
  private CarType carType;
  private String color;
}
