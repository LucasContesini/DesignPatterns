package com.contesini.designpatterns.behavioralpatterns.visitor.shapes;

import com.contesini.designpatterns.behavioralpatterns.visitor.visitor.Visitor;

public interface Shape {

  void move(int x, int y);

  void draw();

  String accept(Visitor visitor);
}

