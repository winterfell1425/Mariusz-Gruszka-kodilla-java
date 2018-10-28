package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> myShapes = new ArrayList<>();

    void addFigure(Shape shape) {

        myShapes.add(shape);
    }
    boolean removeFigure(Shape shape){
        boolean result = false;
        if (myShapes.contains(shape)) {
            myShapes.remove(shape);
            result = true;
        }
        return result;
    }

    Shape getFigure(int n){
        Shape figure = myShapes.get(n);
        return figure;
    }

    void showFigures(){
        System.out.println("These are my figures: " + myShapes);
    }
}