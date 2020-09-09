package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {


    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbers.csv")
    public void isNumberOfWinsCorrect(String strings) throws InvalidNumbersException {

        String[] numbers = strings.split(" ");
        Set<Integer> set = new HashSet<>();

        for (String number : numbers) {
            set.add(Integer.parseInt(number)); //zbiór
        }
        System.out.println(set); //wyświetl zbiór

        int counted = gamblingMachine.howManyWins(set);
        boolean result = counted > 0 && counted < 6;
        if (counted < 1) //jakprzegra
            System.out.println("You lost");
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv")
    public void shouldThrowExceptionWhenTheNumberOfUserNumbersIsDifferentThanSix(String strings) {
        String[] numbers = strings.split(" ");
        Set<Integer> userNumbers = new HashSet<>();

        for (String number : numbers) {
            userNumbers.add(Integer.parseInt(number));
        }
        System.out.println(userNumbers.size());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}