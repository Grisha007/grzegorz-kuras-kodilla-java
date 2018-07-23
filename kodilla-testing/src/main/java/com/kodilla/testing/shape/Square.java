package com.kodilla.testing.shape;

public class Square implements Shape {
    private double squareSide = 4;

    @Override
    public void getShapeName() {
        System.out.println("Shape name: SQUARE");
    }

    @Override
    public void getField() {
        double squareField = squareSide * squareSide;
        System.out.println("Square field: " + squareField);
    }
}
