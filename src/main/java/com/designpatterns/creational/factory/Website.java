package com.designpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

// Abstract class that is going to serve as a blueprint for other classes create their implementation.
// Could be an interface
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return this.pages;
    }

    // Method to be overwritten by child classes that are going to create their websites.
    public abstract void createWebsite();
}
