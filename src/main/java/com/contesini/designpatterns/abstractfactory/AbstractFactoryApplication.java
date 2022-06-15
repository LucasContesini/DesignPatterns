package com.contesini.designpatterns.abstractfactory;

import com.contesini.designpatterns.abstractfactory.factory.FurnitureFactory;
import com.contesini.designpatterns.abstractfactory.factory.ModernFurnitureFactory;
import com.contesini.designpatterns.abstractfactory.factory.OldFurnitureFactory;
import java.util.List;
import java.util.Random;

enum UserChoice {
  OLD,
  MODERN
}

public class AbstractFactoryApplication {

  public static void main(String[] args) {
    var userChoice = getUserChoice();
    FurnitureFactory factory;

    if (userChoice == UserChoice.OLD) {
      factory = new OldFurnitureFactory();
    } else if (userChoice == UserChoice.MODERN) {
      factory = new ModernFurnitureFactory();
    } else {
      throw new RuntimeException(String.format("%s is invalid", userChoice));
    }

    var chair = factory.createChair();
    var sofa = factory.createSofa();

    chair.hasLegs();
    chair.sitOn();
    sofa.hasLegs();
    sofa.sitOn();
    sofa.layOn();
  }

  private static UserChoice getUserChoice() {
    var choices =  List.of(UserChoice.values());
    var random = new Random();

    return choices.get(random.nextInt(choices.size()));
  }

}
