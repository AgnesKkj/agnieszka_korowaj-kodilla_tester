package com.kodilla.collections.interfaces;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }

    public double getPerimeter() {

        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
