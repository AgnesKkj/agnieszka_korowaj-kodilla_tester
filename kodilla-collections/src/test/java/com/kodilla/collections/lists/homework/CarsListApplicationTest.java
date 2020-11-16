package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsListApplicationTest {

    List<Car> cars = new ArrayList<>();
    Car carOne = new Ford(5,1.2,0.9);

    @Test
    public void addsCar() {
        cars.add(carOne);
        assertEquals(1,cars.size());
    }

}