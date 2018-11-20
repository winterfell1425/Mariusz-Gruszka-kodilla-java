package com.kodilla.good.patterns.food2door;

public class Quantity {

    double unitOfMeasure;
    String nameOfMeasure;

    public Quantity(double unitOfMeasure, String nameOfMeasure) {
        this.nameOfMeasure = nameOfMeasure;
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getNameOfMeasure() {
        return nameOfMeasure;
    }

    public double getUnitOfMeasure() {
        return unitOfMeasure;
    }
}
