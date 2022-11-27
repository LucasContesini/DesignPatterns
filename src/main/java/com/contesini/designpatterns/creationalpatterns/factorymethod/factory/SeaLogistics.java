package com.contesini.designpatterns.creationalpatterns.factorymethod.factory;

import com.contesini.designpatterns.creationalpatterns.factorymethod.transport.Ship;
import com.contesini.designpatterns.creationalpatterns.factorymethod.transport.Transport;

public class SeaLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Ship();
  }
}
