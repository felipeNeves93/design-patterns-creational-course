package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// This class is going to act as a cache for Item Flyweight objects
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    // Factory Method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }

        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
