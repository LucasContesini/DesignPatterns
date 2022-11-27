package com.contesini.designpatterns.creationalpatterns.singleton;

public class SingletonApplication {

  public static void main(String[] args) {
    callSingleton();
    callSingleton();
  }

  private static void callSingleton() {
    for (int i = 0; i < 10; i++) {
      var singleton = Singleton.getInstance();

      System.out.println(singleton);
    }
  }


}
