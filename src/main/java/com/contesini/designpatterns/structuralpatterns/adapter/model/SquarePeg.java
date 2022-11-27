package com.contesini.designpatterns.structuralpatterns.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SquarePeg {

  private double width;

  public double getSquare() {
    return Math.pow(this.width, 2);
  }
}
