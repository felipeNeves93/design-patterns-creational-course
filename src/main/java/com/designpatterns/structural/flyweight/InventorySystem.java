package com.designpatterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    protected void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    protected void process() {
        orders.forEach(order -> {
            order.processOrder();
            orders.remove(order);
        });
    }

    protected String report() {
        return "\nTotal Item Objects made: " + catalog.totalItemsMade();
    }
}
