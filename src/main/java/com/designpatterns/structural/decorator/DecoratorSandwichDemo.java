package com.designpatterns.structural.decorator;

public class DecoratorSandwichDemo {

    public static void main(String... args) {

        // Mounting the sandwich. We are not creating, but adding functionality to the exisiting object.
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        // Should print "Bread + Turkey + Mustard"
        System.out.println(sandwich.make());
    }
}
