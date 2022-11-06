package com.contesini.designpatterns.proxy.cachingproxy;

import com.contesini.designpatterns.proxy.cachingproxy.downloader.YouTubeDownloader;
import com.contesini.designpatterns.proxy.cachingproxy.medialibrary.ThirdPartyYouTubeClass;
import com.contesini.designpatterns.proxy.cachingproxy.proxy.YouTubeCacheProxy;

public class CachingProxyApplication {

  public static void main(String[] args) {
    var naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
    var smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

    var naive = test(naiveDownloader);
    var smart = test(smartDownloader);
    System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

  }

  private static long test(YouTubeDownloader downloader) {
    var startTime = System.currentTimeMillis();

    // User behavior in our app:
    downloader.renderPopularVideos();
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderPopularVideos();
    downloader.renderVideoPage("dancesvideoo");
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderVideoPage("someothervid");

    var estimatedTime = System.currentTimeMillis() - startTime;
    System.out.print("Time elapsed: " + estimatedTime + "ms\n");
    return estimatedTime;
  }
}
