package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        //int a = 35;
        //int b = 24;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        //dla różnicy
        int subResult = calculator.sub(a,b);
        boolean correctSub = ResultChecker.assertEquals(11, subResult);
        if(correctSub) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        }
        else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        //dla kwadratu
        int squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);
        if(correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        }
        else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

    }
}
