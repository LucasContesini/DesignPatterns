package com.contesini.designpatterns.decorator.decorators;

public interface DataSource {
  void writeData(String data);

  String readData();
}
