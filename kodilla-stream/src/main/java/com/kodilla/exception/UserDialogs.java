package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("enter number of rounds: ");
            String s = scanner.nextLine();
            //jak jest liczbą
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            }
            //jak nie jest liczbą
            catch (Exception e) {
                System.out.println("wrong data. enter only digits. try again");
            }
        }
    }
}
