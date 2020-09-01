package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

            List<Car> cars = new ArrayList<>();
            cars.add(new Audi(100,70, 7));
            cars.add(new VW(100,70, 2));
            cars.add(new Ford(0,10, 20));
            Audi audi = new Audi(0,32, 19);
            cars.add(audi);

            System.out.println("start of the race: " + cars.size() );
            for (Car car : cars)
                CarUtils.describeCar(car);

            cars.remove(2);
            cars.remove(audi);

            System.out.println("end of the race " + cars.size() );
            for (Car car : cars)
                CarUtils.describeCar(car);
        }
}
