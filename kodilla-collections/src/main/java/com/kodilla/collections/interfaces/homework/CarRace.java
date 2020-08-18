package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(100, 200, 100);
        race(audi);

        VW vw = new VW(190, 90, 109);
        race(vw);

        Ford ford = new Ford(20, 10, 10);
        race(ford);
    }

    private static void race(Car car) {
        System.out.println(car.getName() + "  " + car.getSpeed() + " / " + car.increaseSpeed() + " / " + car.decreaseSpeed());
    }
}
