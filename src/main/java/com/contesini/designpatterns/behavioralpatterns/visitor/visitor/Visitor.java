package com.contesini.designpatterns.behavioralpatterns.visitor.visitor;

import com.contesini.designpatterns.behavioralpatterns.visitor.shapes.Circle;
import com.contesini.designpatterns.behavioralpatterns.visitor.shapes.CompoundShape;
import com.contesini.designpatterns.behavioralpatterns.visitor.shapes.Dot;
import com.contesini.designpatterns.behavioralpatterns.visitor.shapes.Rectangle;

public interface Visitor {

  String visitDot(Dot dot);

  String visitCircle(Circle circle);

  String visitRectangle(Rectangle rectangle);

  String visitCompoundGraphic(CompoundShape cg);
}