package com.contesini.designpatterns.creationalpatterns.abstractfactory;

import com.contesini.designpatterns.creationalpatterns.abstractfactory.factory.OldFurnitureFactory;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.factory.FurnitureFactory;
import com.contesini.designpatterns.creationalpatterns.abstractfactory.factory.ModernFurnitureFactory;
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

    return choices.get(new Random().nextInt(choices.size()));
  }

}
