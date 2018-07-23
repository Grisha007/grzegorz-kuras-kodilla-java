package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle();

        //When
        shapeCollector.addFigure(triangle1);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle();
        shapeCollector.addFigure(triangle1);

        //When
        shapeCollector.removeFigure(triangle1);

        //Then
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle();
        shapeCollector.addFigure(triangle1);

        //When
        Shape retrievedTriangle = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(triangle1, retrievedTriangle);
    }
}
