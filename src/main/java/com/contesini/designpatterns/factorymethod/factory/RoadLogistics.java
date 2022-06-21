package com.contesini.designpatterns.factorymethod.factory;

import com.contesini.designpatterns.factorymethod.transport.Transport;
import com.contesini.designpatterns.factorymethod.transport.Truck;

public class RoadLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Truck();
  }
}
