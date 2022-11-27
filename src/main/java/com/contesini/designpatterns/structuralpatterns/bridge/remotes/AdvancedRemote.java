package com.contesini.designpatterns.structuralpatterns.bridge.remotes;

import com.contesini.designpatterns.structuralpatterns.bridge.devices.Device;


public class AdvancedRemote extends BasicRemote {

  public AdvancedRemote(Device device) {
    super(device);
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setVolume(0);
  }
}
