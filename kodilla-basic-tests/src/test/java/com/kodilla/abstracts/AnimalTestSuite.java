package com.kodilla.abstracts;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTestSuite {


    @Test
    public void testAbstractClassAnimals() {
        Animal spy = Mockito.mock(Dog.class);
        Mockito.mock(Dog.class, Mockito.CALLS_REAL_METHODS);
    }

    @Test
    public void getNumberOfLegs() {
        Animal duck = new Duck();
        //Given
        int expectedLegs = 2;
        //When
        int receivedLegs = duck.getNumberOfLegs();
        //Then
        assertEquals(expectedLegs, receivedLegs);
    }


}