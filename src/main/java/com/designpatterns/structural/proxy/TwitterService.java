package com.designpatterns.structural.proxy;

public interface TwitterService {

    String getTimeline(String screenName);

    void postToTimeLine(String screenName, String message);
}
