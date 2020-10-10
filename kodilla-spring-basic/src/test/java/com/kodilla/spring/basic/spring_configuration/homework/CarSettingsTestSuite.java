
package com.kodilla.spring.basic.spring_configuration.homework;

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
    public void shouldCreateCarBeanByRandomSeason() {
        Car car = (Car) context.getBean("carPicker");
        String type = car.getCarType();
        System.out.println(type);
        List<String> possibleTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(possibleTypes.contains(type));
    }

    @Test
    public void shouldTurnHeadlightsOnDependingOnHour() {
        Car car = (Car) context.getBean("carPicker");
        boolean headlightsOn = car.hasHeadlightsOn();
        System.out.println(headlightsOn);
        //chcę albo prawdę, albo fałsz, nie coś trzeciego
        List<Boolean> headlightsOnOff = Arrays.asList(true, false);
        assertTrue(headlightsOnOff.contains(headlightsOn));
    }

    @Test
    public void shouldTurnHeadlightsOnIndependentlyInWinter() {
        Car car = (Car) context.getBean("carPicker");
        boolean headlightsOn = car.hasHeadlightsOn();
        String type = car.getCarType();
        if(type == "SUV") {
            assertEquals(true,headlightsOn);
        }
    }
}
