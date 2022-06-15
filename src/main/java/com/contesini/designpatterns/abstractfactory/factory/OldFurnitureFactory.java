package com.contesini.designpatterns.abstractfactory.factory;

import com.contesini.designpatterns.abstractfactory.chair.Chair;
import com.contesini.designpatterns.abstractfactory.chair.OldChair;
import com.contesini.designpatterns.abstractfactory.sofa.OldSofa;
import com.contesini.designpatterns.abstractfactory.sofa.Sofa;

public class OldFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new OldChair();
  }

  @Override
  public Sofa createSofa() {
    return new OldSofa();
  }
}
