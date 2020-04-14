package com.designpatterns.structural.flyweight;

// The instances of Item are going to be Flyweights
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
