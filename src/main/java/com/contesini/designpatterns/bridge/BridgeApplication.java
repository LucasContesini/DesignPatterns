package com.contesini.designpatterns.bridge;

import com.contesini.designpatterns.bridge.devices.Device;
import com.contesini.designpatterns.bridge.devices.Radio;
import com.contesini.designpatterns.bridge.devices.Tv;
import com.contesini.designpatterns.bridge.remotes.AdvancedRemote;
import com.contesini.designpatterns.bridge.remotes.BasicRemote;

public class BridgeApplication {

  public static void main(String[] args) {
    var tv = new Tv();
    testDevice(tv);

    var radio = new Radio();
    testDevice(radio);
  }

  private static void testDevice(Device device) {
    var basicRemote = new BasicRemote(device);
    basicRemote.power();
    basicRemote.volumeUp();
    basicRemote.channelDown();
    device.printStatus();

    var advancedRemote = new AdvancedRemote(device);
    advancedRemote.channelUp();
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
