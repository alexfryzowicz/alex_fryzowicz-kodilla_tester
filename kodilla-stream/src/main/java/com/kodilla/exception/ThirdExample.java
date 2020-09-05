package com.kodilla.exception;

public class ThirdExample {

    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("vienna");
        } catch (AirportNotFoundException e) {
            System.out.println("sory this airport cannot be served by our airlines");
        } finally{

        System.out.println("thank u for using kodilla airlines");}
    }
}
