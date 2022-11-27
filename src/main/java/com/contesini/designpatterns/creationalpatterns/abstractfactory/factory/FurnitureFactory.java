package com.contesini.designpatterns.creationalpatterns.abstractfactory.factory;

import com.contesini.designpatterns.creationalpatterns.abstractfactory.chair.Chair;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.sofa.Sofa;

public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();
}
