package com.designpatterns.creational.singleton;

public class SingletonImplementation {

    // Thread safe
    private static volatile SingletonImplementation instance = null;

    // Private constructor to avoid creating using new
    private SingletonImplementation() {
        // Protect the code from reflective call to create instance
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // Method responsible to return the created instance of the class.
    public static SingletonImplementation getInstance() {
        // Lazy loading applied (Improves performance)
        if (instance == null) {
            // Ensures that is thread safe
            synchronized (SingletonImplementation.class) {
                if (instance == null) {
                    instance = new SingletonImplementation();
                }
            }
        }

        return instance;
    }
}
