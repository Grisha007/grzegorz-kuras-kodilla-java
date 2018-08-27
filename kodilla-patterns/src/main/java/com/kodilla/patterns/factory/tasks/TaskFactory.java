package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Buy bag", "bag", 1.0);
            case PAINTING:
                return new PaintingTask("Draw a comics", "grey", "comics");
            case DRIVING:
                return new DrivingTask("Drive to Wroclaw", "Wroclaw", "Using car");
            default:
                return null;
        }
    }
}
