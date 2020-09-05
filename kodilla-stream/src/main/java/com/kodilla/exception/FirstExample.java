package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        //split() dzieli przekazany ciąg znaków (imię i nazwisko) na dwa osobne ciągi

        String[] nameParts = username.split(" ");
        System.out.println("firstname: " + nameParts[0]);
        System.out.println("lastname: " + nameParts[1]);
    }
}
