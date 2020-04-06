package com.designpatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String... args) {
        SingletonImplementation instance = SingletonImplementation.getInstance();
        SingletonImplementation anotherInstance = SingletonImplementation.getInstance();

        // Should print the same instance.
        System.out.println(instance);
        System.out.println(anotherInstance);
    }
}
