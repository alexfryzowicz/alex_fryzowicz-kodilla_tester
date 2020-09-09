package com.kodilla.parametrized_tests.homework;

public class Person {

    private double height;
    private double weight;

    public Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public String getBMI() {
        double bmi = weight / (height * height);
        if (bmi < 15) {
            return "big underweight";
        } else if (bmi < 16) {
            return "underweight";
        } else if (bmi < 18) {
            return "small underweight";
        } else if (bmi < 25) {
            return "healthy weight";
        } else if (bmi < 35) {
            return "overweight";
        }
            return "big overweight";
    }
}