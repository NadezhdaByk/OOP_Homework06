package org.example;

import org.example.IController.Controller;
import org.example.data.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main <T extends Shape> {
    public static void main(String[] args) {
        Controller controller = new Controller();

        List<Shape> shapes = new ArrayList<>(Arrays.asList(
                new Circle(0, 12),
                new Circle(0, 5),
                new Square(0,2, 2),
                new Rectangle(0, 2, 3 ),
                new Triangle(0, 2, 3, 4)
                ));
        System.out.println("Периметр всех фигур: "+controller.getAllLenght(shapes));
        System.out.println("Площадь всех фигур: "+controller.getAllArea(shapes));
    }

}