package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {

    //test double tworzony statycznie z Mockito
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    //domyślne zachowanie
    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }

    //testowanie metody void
    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }

    @Test
    public void testVerificationFailure() {
        myPhone.needsCharging();
        //Mockito.verify(myPhone).getFreeStorage();
        Mockito.verify(myPhone).needsCharging();
    }

}