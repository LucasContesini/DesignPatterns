package com.contesini.designpatterns.abstractfactory.factory;

import com.contesini.designpatterns.abstractfactory.chair.Chair;
import com.contesini.designpatterns.abstractfactory.chair.ModernChair;
import com.contesini.designpatterns.abstractfactory.sofa.ModernSofa;
import com.contesini.designpatterns.abstractfactory.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }
}
