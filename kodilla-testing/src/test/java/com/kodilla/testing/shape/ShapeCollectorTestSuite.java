package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle("bestCircle", 17.0);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.myShapes.size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Shape square = new Square("bestSquare", 16.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertEquals(0, shapeCollector.myShapes.size());
    }
    @Test
    public void testGetFigure() {
        //Given
        Shape triangle = new Triangle("bestTriangle", 18.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(triangle, retrievedFigure);
    }
    //@Test
    //public void testOtherMethods() {
        //Given
        //ShapeCollector shapeCollector = new ShapeCollector();
        //Shape circle = new Circle("circle", 20.0);
        //Shape square = new Square("square", 21.0);
        //Shape triangle = new Triangle("triangle", 22.0);
        //shapeCollector.addFigure(circle);
        //shapeCollector.addFigure(square);
        //shapeCollector.addFigure(triangle);

        //System.out.println(shapeCollector.myShapes);

        //circle.getShapeName();
        //circle.getField();
        //square.getShapeName();
        //square.getField();
        //triangle.getShapeName();
        //triangle.getField();

        //shapeCollector.showFigures();
    //}
}
