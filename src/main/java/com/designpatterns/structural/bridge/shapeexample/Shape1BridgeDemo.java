package com.designpatterns.structural.bridge.shapeexample;

public class Shape1BridgeDemo {

    public static void main(String... args) {

        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();

    }
}
