package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    static Stream<Arguments> provideWeightAndHeightForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.65, 40), "big underweight"),
                Arguments.of(new Person(1.65, 42), "underweight"),
                Arguments.of(new Person(1.65, 48), "small underweight"),
                Arguments.of(new Person(1.65, 57), "healthy weight"),
                Arguments.of(new Person(1.65, 80), "overweight"),
                Arguments.of(new Person(1.65, 99), "big overweight")
        );
    }
}