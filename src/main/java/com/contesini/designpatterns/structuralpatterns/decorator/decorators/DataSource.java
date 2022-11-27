package com.contesini.designpatterns.structuralpatterns.decorator.decorators;

public interface DataSource {
  void writeData(String data);

  String readData();
}
