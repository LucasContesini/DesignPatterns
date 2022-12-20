package com.contesini.designpatterns.behavioralpatterns.strategy.strategies;

public interface PayStrategy {

  boolean pay(int paymentAmount);

  void collectPaymentDetails();
}
