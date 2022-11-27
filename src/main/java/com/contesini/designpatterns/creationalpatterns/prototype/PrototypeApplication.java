package com.contesini.designpatterns.creationalpatterns.prototype;

public class PrototypeApplication {

  public static void main(String[] args) {
    var rectangle = createRectangle();
    System.out.println(rectangle);

    var cloneRectangle = (Rectangle) rectangle.clone();
    System.out.println(cloneRectangle);

    var sameObject = rectangle == cloneRectangle;
    System.out.println("Rectangles are the same objects? " + sameObject);
    System.out.println("Rectangles are identical? " + rectangle.equals(cloneRectangle));
  }

  private static Rectangle createRectangle() {
    var rectangle = new Rectangle();
    rectangle.setX(1);
    rectangle.setY(2);
    rectangle.setWidth(3);
    rectangle.setHeight(4);
    return rectangle;
  }
}
