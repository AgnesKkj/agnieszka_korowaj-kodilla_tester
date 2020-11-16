package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CarUtilsTest {

    CarUtils carUtils = Mockito.spy(CarUtils.class);
    Car ford = new Ford(1.4,0.9,1.2);

    @Test
    public void mockDescribeCar() {
        Mockito.verify(carUtils).describeCar(ford);
    }

}