package com.designpatterns.structural.bridge.shapeexample;

public class Blue implements Color {

    @Override
    public void applyColor() {
        System.out.printf("Applying the blue color!");
    }
}
