package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

//przypadki, w których ma rzucić wyjątek
    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToFail.csv")
    public void shouldThrowExceptionWithInvalidNumbersProvided(String numbers) {
        String[] expectedArray = numbers.split(",");
        Set<Integer> expectedParsed = new HashSet<>();
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toCollection(() -> expectedParsed));
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(expectedParsed));
    }

    //przypadki, w których ma przejść
    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToPass.csv")
    public void shouldPassValidatingMethodWithValidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<Integer> expectedParsed = new HashSet<>();
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toCollection(() -> expectedParsed));
        GamblingMachine.validateNumbers(expectedParsed);
        assertEquals(6,expectedParsed.size());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToPass.csv")
    public void shouldCountWinsWithValidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<Integer> expectedParsed = new HashSet<>();
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toCollection(() -> expectedParsed));
        System.out.println("Number of wins: " + gamblingMachine.howManyWins(expectedParsed));
        assertNotNull(gamblingMachine.howManyWins(expectedParsed));
    }

}