package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class AnimalProcessorTest {

    @Test
    public void mockAnimalProcessor() {
        //Given
        AnimalProcessor animalProcessor = Mockito.mock(AnimalProcessor.class);
        Animal dog = new Dog();
        //When
        animalProcessor.process(dog);
        //Then
        Mockito.verify(animalProcessor).process(dog);
    }

}