package com.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String... args){

        // You choose wich of the fields are going to be populated
        LunchOrder lunchOrder = new LunchOrder.Builder()
                .bread("bread")
                .condiments("condiments")
                .dressing("dressing")
                .meat("meat")
                .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
