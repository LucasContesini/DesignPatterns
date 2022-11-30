package com.contesini.designpatterns.behavioralpatterns.iterator.iterators;

import com.contesini.designpatterns.behavioralpatterns.iterator.profile.Profile;

public interface ProfileIterator {

  boolean hasNext();

  Profile getNext();

  void reset();
}
