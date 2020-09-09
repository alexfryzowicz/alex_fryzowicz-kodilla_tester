package com.kodilla.parametrized_tests;

public class StringValidator {
//Metoda zwraca true, gdy przekazana wartość jest równa null lub gdy text pozbawiony spacji (trim()) jest pusty
    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}