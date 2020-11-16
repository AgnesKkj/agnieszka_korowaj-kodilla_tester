package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class ApplicationTest {

        @Test
        public void mockGiveVoice() {
            //Given
            Animal dog = Mockito.mock(Dog.class);
            //When
            dog.giveVoice();
            //Then
            Mockito.verify(dog).giveVoice();
        }

}