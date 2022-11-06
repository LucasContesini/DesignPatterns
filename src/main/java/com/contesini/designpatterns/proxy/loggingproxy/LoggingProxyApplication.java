package com.contesini.designpatterns.proxy.loggingproxy;

public class LoggingProxyApplication {

  public static void main(String[] args) {
    var countWithoutProxy = new CountImpl();
    var countWithProxy = new CountImplProxy();
    test(countWithoutProxy);
    test(countWithProxy);
  }

  private static void test(Count count) {
    Double num1 = 1.0;
    Double num2 = 2.0;
    var sum = count.sum(num1, num2);
    System.out.println(sum);
  }
}
