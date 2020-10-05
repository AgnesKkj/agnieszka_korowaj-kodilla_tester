package com.kodilla.spring.basic.spring_configuration.homework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import java.util.Random;
import static com.kodilla.spring.basic.spring_configuration.homework.CarSettings.Seasons.*;


@Configuration
public class CarSettings {

    enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }

    private Seasons season;
    Car car;

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
        Random random = new Random();
        int seasonNumber = random.nextInt(4);
        switch(seasonNumber) {
            case 0:
                season = SPRING;
                car = new Sedan();
                System.out.println("It's " + season + " and we drive a " + car.getCarType());
                car.turnLightsDependingOnHour();
                break;
            case 1:
                season = SUMMER;
                car = new Cabrio();
                System.out.println("It's " + season + " and we drive a " + car.getCarType());
                car.turnLightsDependingOnHour();
                break;
            case 2:
                season = FALL;
                car = new Sedan();
                System.out.println("It's " + season + " and we drive a " + car.getCarType());
                car.turnLightsDependingOnHour();
                break;
            case 3:
                season = WINTER;
                car = new SUV();
                System.out.println("It's " + season + " and we drive a " + car.getCarType());
                car.turnLights("on");
                System.out.println("Headlights all day long: " + car.hasHeadlightsOn());
                break;
            default:
                System.out.println("Error: something went wrong.");
        }
        return car;
    }
}


