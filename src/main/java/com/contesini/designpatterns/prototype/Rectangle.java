package com.contesini.designpatterns.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(Rectangle rectangle) {
    super(rectangle);
    this.width = rectangle.width;
    this.height = rectangle.height;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }
}
