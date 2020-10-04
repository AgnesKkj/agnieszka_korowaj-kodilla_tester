package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarSettingsTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

    @Test
    public void shouldCreateTestCar() {
        Sedan sedan = context.getBean(Sedan.class);
        String type = sedan.getCarType();
        assertEquals("Sedan", type);
    }

    @Test
    public void shouldCreateCarBeanAndFetchByBeanName() {
        Sedan sedan = (Sedan) context.getBean("createSedan");
        String type = sedan.getCarType();
        assertEquals("Sedan", type);
    }

    @Test
    public void shouldCreateRandomCar() {
        Car car = (Car) context.getBean("carPicker");
        String type = car.getCarType();
        List<String> possibleTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleTypes.contains(type));
    }

    @Test
    public void shouldTurnLightsOn() {
        Car car = (Car) context.getBean("carPicker");
        int hour = 19;
        boolean hasHeadLightsTurnedOn = car.hasHeadlightsOn();
        assertFalse(car.);
    }

}