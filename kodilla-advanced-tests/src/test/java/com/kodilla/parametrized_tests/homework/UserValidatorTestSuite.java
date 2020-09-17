package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    //testowana metoda nie obsługuje przypadku null, test nie przyjmuje adnotacji
    /*@ParameterizedTest (expected =  NullPointerException.class)
    @NullSource
    public void shouldReturnFalseWhenUsernameNull_withException(String username) throws NullPointerException {
        assertFalse(validator.validateUsername(username));
    }*/

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"5", "d4"})
    public void shouldReturnFalseWhenUsernameBelowThreeChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Agn#s", "b2d,,,9f&7"})
    public void shouldReturnFalseWhenUsernameContainsForbiddenChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    /*1. true -> zawiera małe litery
    2. zawiera wielkie litery
    3. zawiera cyfry 0-9
    4. zawiera {.}, {-} lub {_}*/

    @ParameterizedTest
    @ValueSource(strings = {"user", "USER", "User111", "User_111", "234", "uSeR-911", "UsER.111", "-._"})
    public void shouldReturnTrueWhenUsernameContainsAnyPermittedChars(String username) {
        assertTrue(validator.validateUsername(username));
    }

   // zwraca false, kiedy e-mail jest null
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailNull(String email) {

        assertFalse(validator.validateEmail(email));
    }

    /*@ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenEmailEmpty(String email) {
        assertFalse(validator.validateEmail(email));
    }*/


    //e-mail zawiera {.} lub {@} w niedozwolonym miejscu
    @ParameterizedTest
    @ValueSource(strings = {"use@r1@yah.oo.com", "us.er1@ya@h.oo.c.om"})
    public void shouldReturnFalseWhenForbiddenChars(String email) {

        assertFalse(validator.validateEmail(email));
    }

    //e-mail zawiera niedozwolone znaki
    @ParameterizedTest
    @ValueSource(strings = {"u$er!@gm21l.com", "us%+@h0,,-.org"})
    public void shouldReturnFalseIfContainsForbiddenChars(String email) {

        assertFalse(validator.validateEmail(email));
    }

    //Domena poza dozwoloną liczbą znaków {0,7}
    @ParameterizedTest
    @ValueSource (strings = {"user123@gmail.", "user345@gmail.comcomco"})
    public void shouldReturnFalseIfDomainEmptyOrTooManyChars(String email) {
        assertFalse(validator.validateEmail(email));
    }

    /*1. true -> zawiera małe litery
    2. zawiera wielkie litery
    3. zawiera cyfry 0-9
    4. zawiera {-} lub {_} w nazwie użytkownika
    5. zawiera {-} w domenie
    6. domena 1-6 znaków*/

    @ParameterizedTest
    @ValueSource(strings = {"Us3r-9.g8@outlook.COM", "tH1s_is_g3n3r4ted@yahoo9.com", "FluffCandy97@soc-ial.io"})
    public void shouldReturnTrueIfContainsAllPermittedChars(String email) {
        assertTrue(validator.validateEmail(email));
    }
}