package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultCheckerTestSuite {

    @Test
    public void assertsEquals(){
        //Given
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 5;
        int expected = a + b;
        int actual = calculator.sum(a,b);
        //When
        ResultChecker.assertEquals(expected, actual);
        //Then
        assertTrue(ResultChecker.assertEquals(expected, actual));
    }

    @Test
    public void doesNotAssertNonEquals() {
        //Given
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 5;
        int c = 3;
        int expected = b + c;
        int actual = calculator.sum(a,b);
        //When
        ResultChecker.assertEquals(expected, actual);
        //Then
        assertFalse(ResultChecker.assertEquals(expected, actual));
    }

}