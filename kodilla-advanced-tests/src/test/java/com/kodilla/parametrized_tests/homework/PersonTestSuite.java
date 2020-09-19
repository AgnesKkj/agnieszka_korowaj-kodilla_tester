package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataSources#provideDataForTestingBMI")
    void shouldCalculateBMIWithProvidedDataExternalSource(Person person) {
        System.out.println(person.getBMI());
        Stream<String> expected = Stream.of("Overweight","Obese Class V (Super Obese)","Normal (healthy weight)","Normal (healthy weight)","Very severely underweight","Obese Class IV (Morbidly Obese)");
        boolean match = expected.anyMatch(un -> un.equals(person.getBMI()));
        assertTrue(match);
    }


}

