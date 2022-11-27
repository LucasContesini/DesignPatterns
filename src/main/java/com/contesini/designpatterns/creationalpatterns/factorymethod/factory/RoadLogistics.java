package com.contesini.designpatterns.creationalpatterns.factorymethod.factory;

import com.contesini.designpatterns.creationalpatterns.factorymethod.transport.Transport;
import com.contesini.designpatterns.creationalpatterns.factorymethod.transport.Truck;

public class RoadLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Truck();
  }
}
