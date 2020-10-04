package com.kodilla.spring.basic.spring_configuration.homework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import java.util.Random;


@Configuration
public class CarSettings {

    private String seasonName;
    private Car car;

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
    public Car carPicker() {
        Random generator = new Random();
        int seasonNumber = generator.nextInt(5);
        switch(seasonNumber) {
            case 0:
                seasonName = "Spring";
                car = new Sedan();
                System.out.println("It's " + seasonName + " and we drive a " + car.getCarType());
                break;
            case 1:
                seasonName = "Summer";
                car = new Cabrio();
                System.out.println("It's " + seasonName + " and we drive a " + car.getCarType());
                break;
            case 2:
                seasonName = "Fall";
                car = new Sedan();
                System.out.println("It's " + seasonName + " and we drive a " + car.getCarType());
                break;
            case 3:
                seasonName = "Winter";
                car = new SUV();
                System.out.println("It's " + seasonName + " and we drive a " + car.getCarType());
                break;
            default:
                System.out.println("Error: something went wrong.");
        }
        return car;
    }

}


