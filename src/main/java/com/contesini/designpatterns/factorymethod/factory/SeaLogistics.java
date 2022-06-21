package com.contesini.designpatterns.factorymethod.factory;

import com.contesini.designpatterns.factorymethod.transport.Ship;
import com.contesini.designpatterns.factorymethod.transport.Transport;

public class SeaLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Ship();
  }
}
