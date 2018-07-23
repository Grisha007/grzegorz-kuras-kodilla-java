package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public void showFigure(Shape shape){
        shape.getShapeName();
    }

    public int getShapesQuantity(){
        return shapes.size();
    }
}
