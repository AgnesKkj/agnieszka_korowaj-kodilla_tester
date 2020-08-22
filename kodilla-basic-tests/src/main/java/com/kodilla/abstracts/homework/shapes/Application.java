package com.kodilla.abstracts.homework.shapes;

public class Application {
    public static void main(String[] args) {
        Shape squareOne = new Square(6.0);
        System.out.println("Pole kwadratu: " + squareOne.calcArea());
        System.out.println("Obwód kwadratu: " + squareOne.calcPerimeter());

        Shape triangleOne = new Triangle(6.0, 4.0, 4.0, 2.64575);
        System.out.println("Pole trójkąta: " + triangleOne.calcArea());
        System.out.println("Obwód trójkąta: " + triangleOne.calcPerimeter());

        Shape circleOne = new Circle(8.0);
        System.out.println("Pole koła: " + circleOne.calcArea());
        System.out.println("Obwód okręgu: " + circleOne.calcPerimeter());
    }
}
