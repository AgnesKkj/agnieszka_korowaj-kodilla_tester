package com.kodilla.spring.basic.spring_dependency_injection.homework.calculator;

import com.kodilla.spring.basic.spring_dependency_injection.homework.calculator.calculator.Calculator;
import com.kodilla.spring.basic.spring_dependency_injection.homework.calculator.calculator.DivideByZero;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    double a = 4.5;
    double b = 2.4;
    double c = 3.0;
    double d = 6.0;
    double e = 0.0;

    @Test
    public void shouldAdd() {
        double sum = bean.add(a,b);
        assertEquals(6.9,sum);
    }

    @Test
    public void shouldSubstract() {
        double difference = bean.substract(a,b);
        assertEquals(2.1,difference);
    }

    @Test
    public void shouldMultiply() {
        double product = bean.multiply(c,d);
        assertEquals(18,product);
    }

    @Test
    public void shouldDivide() throws DivideByZero {
        double quotient = bean.divide(c,d);
        assertEquals(0.5,quotient);
    }

    @Test (expected = DivideByZero.class)
    public void shouldNotDivideByZero() throws DivideByZero {
        double quotientWithZero = bean.divide(c,e);
        assertNotNull(quotientWithZero);
    }
}