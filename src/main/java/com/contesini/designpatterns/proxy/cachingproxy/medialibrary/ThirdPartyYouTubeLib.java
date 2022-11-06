package com.contesini.designpatterns.proxy.cachingproxy.medialibrary;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

  HashMap<String, Video> popularVideos();

  Video getVideo(String videoId);
}
