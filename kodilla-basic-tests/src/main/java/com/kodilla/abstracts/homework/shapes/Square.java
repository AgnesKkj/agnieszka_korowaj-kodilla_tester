package com.kodilla.abstracts.homework.shapes;

public class Square extends Shape {

    private double side;

    public Square(double side) {
       super();
       this.side = side;
       System.out.println("Utworzono kwadrat o boku " + this.side);
    }

    @Override
    public double calcArea() {
        double area;
        area = this.side * this.side;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = this.side * 4;
        return perimeter;
    }

}
