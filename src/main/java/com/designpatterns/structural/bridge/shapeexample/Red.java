package com.designpatterns.structural.bridge.shapeexample;

public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.printf("Applying the Red color!");
    }
}
