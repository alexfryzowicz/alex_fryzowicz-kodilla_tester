package com.kodilla.collections.lists;


import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.List;
import java.util.LinkedList;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();

        Square square = new Square(10.0);

        shapes.add(new Square(10.0));
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));

        shapes.remove(1);
        shapes.remove(square);

        Triangle triangle = new Triangle(10.0, 4.0, 10.77);
        shapes.remove(triangle);

        for (Shape shape : shapes) {
            System.out.println(shape + " area: " + shape.getArea() + " perimeter: " + shape.getPerimeter());
        }
    }
}
