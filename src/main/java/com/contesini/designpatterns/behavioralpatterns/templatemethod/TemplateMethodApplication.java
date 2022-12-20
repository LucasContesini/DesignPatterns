package com.contesini.designpatterns.behavioralpatterns.templatemethod;

import com.contesini.designpatterns.behavioralpatterns.templatemethod.networks.Facebook;
import com.contesini.designpatterns.behavioralpatterns.templatemethod.networks.Network;
import com.contesini.designpatterns.behavioralpatterns.templatemethod.networks.Twitter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemplateMethodApplication {

  public static void main(String[] args) throws IOException {
    var reader = new BufferedReader(new InputStreamReader(System.in));
    Network network = null;
    System.out.print("Input user name: ");
    String userName = reader.readLine();
    System.out.print("Input password: ");
    String password = reader.readLine();

    // Enter the message.
    System.out.print("Input message: ");
    var message = reader.readLine();

    System.out.println("\nChoose social network for posting message.\n" +
        "1 - Facebook\n" +
        "2 - Twitter");
    int choice = Integer.parseInt(reader.readLine());

    // Create proper network object and send the message.
    if (choice == 1) {
      network = new Facebook(userName, password);
    } else if (choice == 2) {
      network = new Twitter(userName, password);
    }
    network.post(message);
  }
}
