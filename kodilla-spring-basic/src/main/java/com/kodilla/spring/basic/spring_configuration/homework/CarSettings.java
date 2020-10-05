package com.kodilla.spring.basic.spring_configuration.homework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import java.util.Random;

import static com.kodilla.spring.basic.spring_configuration.homework.CarSettings.Seasons.*;


@Configuration
public class CarSettings {

    private String seasonName;
    private Car car;

    public enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }

    private Seasons season;

    @Bean
    public SUV createSUV() {
        return new SUV();
    }

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Cabrio createCabrio() {
        return new Cabrio();
    }


    @Bean
    @Primary
    public Car carPicker(Seasons season) {
        Random generator = new Random();
        int seasonNumber = generator.nextInt(5);
        switch(season) {
            case SPRING:
                car = new Sedan();
                System.out.println("It's " + SPRING + " and we drive a " + car.getCarType());
                car.turnLightsDependingOnHour();
                break;
            case SUMMER:
                car = new Cabrio();
                System.out.println("It's " + SUMMER + " and we drive a " + car.getCarType());
                car.turnLightsDependingOnHour();
                break;
            case FALL:
                car = new Sedan();
                System.out.println("It's " + FALL + " and we drive a " + car.getCarType());
                car.turnLightsDependingOnHour();
                break;
            case WINTER:
                car = new SUV();
                System.out.println("It's " + WINTER + " and we drive a " + car.getCarType());
                car.turnLights("on");
                System.out.println("Headlights all day long: " + car.hasHeadlightsOn());
                break;
            default:
                System.out.println("Error: something went wrong.");
        }
        return car;
    }

}


