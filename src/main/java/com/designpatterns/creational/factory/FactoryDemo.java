package com.designpatterns.creational.factory;

public class FactoryDemo {

    public static void main(String... args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        // Must return the specific pages from an blog.
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        // Should return the pages related to a shop page.
        System.out.println(website.getPages());
    }
}
