package com.contesini.designpatterns.factorymethod.factory;

import com.contesini.designpatterns.factorymethod.transport.Transport;

public abstract class Logistics {

  abstract Transport createTransport();

  public Transport planDelivery() {
    return createTransport();
  }
}
