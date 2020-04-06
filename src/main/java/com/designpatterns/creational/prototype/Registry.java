package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    // Get the default information that we've created the itens in loadItems method
    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) (items.get(type).clone());
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Title");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Title");
        items.put("Book", book);
    }
}
