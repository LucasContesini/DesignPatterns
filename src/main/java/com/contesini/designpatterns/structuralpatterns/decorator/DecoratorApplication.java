package com.contesini.designpatterns.structuralpatterns.decorator;

import com.contesini.designpatterns.structuralpatterns.decorator.decorators.CompressionDecorator;
import com.contesini.designpatterns.structuralpatterns.decorator.decorators.EncryptionDecorator;
import com.contesini.designpatterns.structuralpatterns.decorator.decorators.FileDataSource;

public class DecoratorApplication {

  public static void main(String[] args) {
    var salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

    var decorator = new CompressionDecorator(
        new EncryptionDecorator(
            new FileDataSource("DecoratorDemo.txt")));

    decorator.writeData(salaryRecords);
    var plain = new FileDataSource("DecoratorDemo.txt");

    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(decorator.readData());
  }
}
