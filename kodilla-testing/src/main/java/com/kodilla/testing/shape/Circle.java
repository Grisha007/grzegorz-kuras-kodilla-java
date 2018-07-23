package com.kodilla.testing.shape;

public class Circle implements Shape {
    final double PI = 3.14;
    double circleRadius = 6;

    @Override
    public void getShapeName() {
        System.out.println("Shape name: CIRCLE");
    }

    @Override
    public void getField() {
        double circleField = PI * (circleRadius * circleRadius);
    }
}
