package com.kodilla.spring.basic.spring_dependency_injection.homework.calculator.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator (Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double sum = a + b;
        this.display.display(sum);
        return sum;
    }

    public double substract(double a, double b) {
        double difference = a - b;
        this.display.display(difference);
        return difference;
    }

    public double multiply(double a, double b) {
        double product = a * b;
        this.display.display(product);
        return product;
    }

    public double divide(double a, double b) throws DivideByZero {
        double quotient = a / b;
        if(b == 0) {
            System.out.println("Error: dividing by zero");
            throw new DivideByZero();
        }
        this.display.display(quotient);
        return quotient;
    }
}
