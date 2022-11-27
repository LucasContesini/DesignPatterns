package com.contesini.designpatterns.creationalpatterns.abstractfactory.factory;

import com.contesini.designpatterns.creationalpatterns.abstractfactory.chair.Chair;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.chair.ModernChair;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.sofa.ModernSofa;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.sofa.Sofa;

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
