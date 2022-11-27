package com.contesini.designpatterns.structuralpatterns.adapter.adapter;

import com.contesini.designpatterns.structuralpatterns.adapter.model.RoundPeg;
import com.contesini.designpatterns.structuralpatterns.adapter.model.SquarePeg;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SquarePegAdapter extends RoundPeg {

  private SquarePeg peg;

  @Override
  public double getRadius() {
    var pow = Math.pow((peg.getWidth() / 2), 2);
    return Math.sqrt(pow * 2);
  }
}
