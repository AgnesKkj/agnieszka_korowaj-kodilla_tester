package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class DataSources {

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


}
