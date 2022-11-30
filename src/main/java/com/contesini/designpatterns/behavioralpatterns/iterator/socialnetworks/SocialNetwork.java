package com.contesini.designpatterns.behavioralpatterns.iterator.socialnetworks;

import com.contesini.designpatterns.behavioralpatterns.iterator.iterators.ProfileIterator;

public interface SocialNetwork {

  ProfileIterator createFriendsIterator(String profileEmail);

  ProfileIterator createCoworkersIterator(String profileEmail);
}
