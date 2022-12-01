package com.contesini.designpatterns.behavioralpatterns.mediator.components;

import com.contesini.designpatterns.behavioralpatterns.mediator.mediator.Mediator;

public interface Component {

  void setMediator(Mediator mediator);

  String getName();
}