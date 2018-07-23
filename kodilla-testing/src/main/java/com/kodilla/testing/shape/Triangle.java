package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double triangleSide = 5.5;
    private double triangleHeight = 7;

    @Override
    public void getShapeName(){
        System.out.println("Shape name: TRIANGLE");
    }

    @Override
    public void getField() {
        double triangleField = (triangleSide * triangleHeight) / 2;
        System.out.println("Triangle field: " + triangleField);
    }
}
