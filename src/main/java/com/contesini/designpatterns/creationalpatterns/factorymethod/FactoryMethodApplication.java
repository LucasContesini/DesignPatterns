package com.contesini.designpatterns.creationalpatterns.factorymethod;

import com.contesini.designpatterns.creationalpatterns.factorymethod.factory.Logistics;
import com.contesini.designpatterns.creationalpatterns.factorymethod.factory.RoadLogistics;
import com.contesini.designpatterns.creationalpatterns.factorymethod.factory.SeaLogistics;
import java.util.List;
import java.util.Random;

enum UserChoice {
  ROAD,
  SEA
}

public class FactoryMethodApplication {

  public static void main(String[] args) {
    var userChoice = getUserChoice();
    Logistics logistics;
    if (userChoice == UserChoice.ROAD) {
      logistics = new RoadLogistics();
    } else if (userChoice == UserChoice.SEA) {
      logistics = new SeaLogistics();
    } else {
      throw new RuntimeException(String.format("%s is invalid", userChoice));
    }

    var transport = logistics.planDelivery();

    transport.deliver();
  }

  private static UserChoice getUserChoice() {
    var choices = List.of(UserChoice.values());

    return choices.get(new Random().nextInt(choices.size()));
  }
}
