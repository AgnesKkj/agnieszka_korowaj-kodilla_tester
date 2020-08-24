package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 35;
        int b = 24;
        int subResult = calculator.sub(a,b);
        assertEquals(11, subResult);
    }

    @Test
    public void testSquareNeg() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResultNeg = calculator.square(a);
        assertEquals(25, squareResultNeg);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResultZ = calculator.square(a);
        assertEquals(0, squareResultZ);
    }

    @Test
    public void testSquarePos() {
        Calculator calculator = new Calculator();
        //ustawione, żeby wyszedł fail
        int a = 6;
        int squareResultPos = calculator.square(a);
        assertEquals(36, squareResultPos);
    }
}