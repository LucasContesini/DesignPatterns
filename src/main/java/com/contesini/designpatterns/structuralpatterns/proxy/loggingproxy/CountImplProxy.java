package com.contesini.designpatterns.structuralpatterns.proxy.loggingproxy;

public class CountImplProxy implements Count {

  private final Count countImpl;

  public CountImplProxy() {
    countImpl = new CountImpl();
  }

  @Override
  public Double sum(Double num1, Double num2) {
    System.out.println("Logging proxy working...");
    System.out.println("Sum: " + num1 + " + " + num2);
    var sum = countImpl.sum(num1, num2);
    System.out.println("Result: " + sum);
    return sum;
  }
}
