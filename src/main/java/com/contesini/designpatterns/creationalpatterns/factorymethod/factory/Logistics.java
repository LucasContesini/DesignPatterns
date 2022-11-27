package com.contesini.designpatterns.creationalpatterns.factorymethod.factory;

import com.contesini.designpatterns.creationalpatterns.factorymethod.transport.Transport;

public abstract class Logistics {

  abstract Transport createTransport();

  public Transport planDelivery() {
    return createTransport();
  }
}
