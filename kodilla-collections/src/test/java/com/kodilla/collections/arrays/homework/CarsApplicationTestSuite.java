package com.kodilla.collections.arrays.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarsApplicationTestSuite {

    @Test
    public void testDrawCar() {
        CarsApplication.drawCar();
        System.out.println(CarsApplication.drawCar());
        assertNotNull(CarsApplication.drawCar());

    }

}