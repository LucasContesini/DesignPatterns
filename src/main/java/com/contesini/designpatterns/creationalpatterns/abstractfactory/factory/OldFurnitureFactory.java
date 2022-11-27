package com.contesini.designpatterns.creationalpatterns.abstractfactory.factory;

import com.contesini.designpatterns.creationalpatterns.abstractfactory.chair.Chair;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.chair.OldChair;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.sofa.OldSofa;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.sofa.Sofa;

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
