package com.designpatterns.structural.bridge.shapeexample;

public class Green implements Color {

    @Override
    public void applyColor() {
        System.out.printf("Applying the Green color!");
    }
}
