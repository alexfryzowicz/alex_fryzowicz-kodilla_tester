package com.kodilla.parametrized_tests;

public class StringManipulator {
// metoda, która odwraca kolejność znaków i wynik zwraca w postaci małych liter
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }
    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
//liczy liczbę przecinków w tekście:
    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}