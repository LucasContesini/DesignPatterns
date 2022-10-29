package com.contesini.designpatterns.adapter;

import com.contesini.designpatterns.adapter.adapter.SquarePegAdapter;
import com.contesini.designpatterns.adapter.model.RoundHole;
import com.contesini.designpatterns.adapter.model.RoundPeg;
import com.contesini.designpatterns.adapter.model.SquarePeg;

public class AdapterApplication {

  public static void main(String[] args) {
    var hole = new RoundHole(5);
    var roundPeg = new RoundPeg(5);
    if (hole.fits(roundPeg)) {
      System.out.println("Round peg r5 fits round hole r5.");
    }

    var smallSqPeg = new SquarePeg(2);
    var largeSqPeg = new SquarePeg(20);

    var smallSquarePegAdapter = new SquarePegAdapter(smallSqPeg);
    var largeSquarePegAdapter = new SquarePegAdapter(largeSqPeg);

    if (hole.fits(smallSquarePegAdapter)) {
      System.out.println("Square peg w2 fits round hole r5.");
    }
    if (!hole.fits(largeSquarePegAdapter)) {
      System.out.println("Square peg w20 does not fit into round hole r5.");
    }
  }
}
