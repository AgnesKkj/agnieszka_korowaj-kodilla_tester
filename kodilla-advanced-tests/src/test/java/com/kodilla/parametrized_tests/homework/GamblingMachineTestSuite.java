package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    //przypadki, w których ma rzucić wyjątek
    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToPass.csv")
    public void shouldThrowExceptionWithInvalidNumbersProvided(String numbers) {
        Set<Integer> expectedNumbers = new HashSet<>();
        //???
        expectedNumbers.add(Integer.parseInt(numbers));
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(expectedNumbers));
    }

    //przypadki, w których ma przejść
    @ParameterizedTest
    //@CsvSource(value = {"38","23","41","9","43","31"})
    @CsvFileSource(resources = "/randomNumbersToPass.csv")
    public void shouldNotThrowExceptionWithValidNumbersProvided(String numbers) throws InvalidNumbersException {
        Set<Integer> expectedNumbers = new HashSet<>();
        //???
        expectedNumbers.add(Integer.parseInt(numbers));
        gamblingMachine.validateNumbers(expectedNumbers);
        assertEquals(6,gamblingMachine.howManyWins(expectedNumbers));
    }

}