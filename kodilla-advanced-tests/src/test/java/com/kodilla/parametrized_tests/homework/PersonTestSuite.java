package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class PersonTestSuite {

    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.76,85)),
                Arguments.of(new Person(1.54,120)),
                Arguments.of(new Person(1.65,57)),
                Arguments.of(new Person(1.57,52)),
                Arguments.of(new Person(1.93,48)),
                Arguments.of(new Person(1.78,150))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataSources#provideDataForTestingBMI")
    void shouldCalculateBMIWithProvidedDataExternalSource(Person person) {
        System.out.println(person.getBMI());
        assertNotNull(person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "provideDataForTestingBMI")
    void shouldCalculateBMIWithProvidedDataInternalSource(Person person) {
        System.out.println(person.getBMI());
        assertNotNull(person.getBMI());
    }
}

