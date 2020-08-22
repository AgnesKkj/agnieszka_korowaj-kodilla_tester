package com.kodilla.abstracts.homework.shapes;

public class Triangle extends Shape {

    private double base;
    private double sideTwo;
    private double sideThree;
    private double height;

    public Triangle(double base, double sideTwo, double sideThree, double height) {
        super();
        this.base = base;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.height = height;
        System.out.println("Utworzono trójkąt o bokach " + this.base + ", " + this.sideTwo + ", " + this.sideThree + " i wysokości " + this.height);


    }

    @Override
    public double calcArea() {
        double area;
        area = this.base * this.height / 2;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter;
        perimeter = this.base + this.sideTwo + this.sideThree;
        return perimeter;
    }


}
