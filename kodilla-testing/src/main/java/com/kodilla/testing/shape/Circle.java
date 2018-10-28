package com.kodilla.testing.shape;

import java.util.Objects;

class Circle implements Shape {

    private String name;
    private double area;

    public Circle(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public void getShapeName() {
        System.out.println("Name of this shape is: " + name);
    }

    @Override
    public void getField() {
        System.out.println("The area of this shape is: " + area + " square centimeters.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.area, area) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
