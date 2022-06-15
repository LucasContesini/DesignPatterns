package com.contesini.designpatterns.abstractfactory.factory;

import com.contesini.designpatterns.abstractfactory.chair.Chair;
import com.contesini.designpatterns.abstractfactory.sofa.Sofa;

public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();
}
