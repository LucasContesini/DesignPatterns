package com.contesini.designpatterns.structuralpatterns.proxy.cachingproxy.medialibrary;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

  HashMap<String, Video> popularVideos();

  Video getVideo(String videoId);
}
