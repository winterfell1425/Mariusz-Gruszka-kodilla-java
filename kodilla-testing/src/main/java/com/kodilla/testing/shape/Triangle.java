package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private String name;
    private double area;

    public Triangle(String name, double area) {
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
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.area, area) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
