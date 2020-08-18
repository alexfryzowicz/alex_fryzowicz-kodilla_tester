package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private String name = "Audi";
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Audi(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return increaseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        return decreaseSpeed;
    }
}
