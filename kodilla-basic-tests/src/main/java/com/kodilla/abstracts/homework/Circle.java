package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private static double PI = 3.1415927;
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        System.out.println("Utworzono okrąg o promieniu " + this.radius);
    }

    @Override
    public double calcArea() {
        double area;
        area = this.radius * PI;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter;
        perimeter = this.radius * 2 * PI;
        return perimeter;
    }
}
