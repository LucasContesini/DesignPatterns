package com.contesini.designpatterns.creationalpatterns.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Shape {

  private int x;
  private int y;

  public Shape(Shape shape) {
    this.x = shape.x;
    this.y = shape.y;
  }

  public abstract Shape clone();
}
