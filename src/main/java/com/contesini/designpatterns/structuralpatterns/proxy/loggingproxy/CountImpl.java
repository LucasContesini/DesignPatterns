package com.contesini.designpatterns.structuralpatterns.proxy.loggingproxy;

public class CountImpl implements Count {

  @Override
  public Double sum(Double num1, Double num2) {
    return num1 + num2;
  }
}
