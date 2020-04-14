package com.designpatterns.structural.flyweight;

public class Order {

    private final int orderNumber;
    private final Item item;

    protected Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    protected void processOrder() {
        System.out.println("Ordering " + item + " for order number: " + orderNumber);
    }
}
