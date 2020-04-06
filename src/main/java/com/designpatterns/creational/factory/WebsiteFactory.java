package com.designpatterns.creational.factory;

public class WebsiteFactory {

    // Basic Factory method.
    // Creation happens on subclass.
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();

            case SHOP:
                return new Shop();

            default:
                return null;
        }
    }
}
