package org.example.Service;

import org.example.data.Circle;
import org.example.data.Rectangle;
import org.example.data.Shape;
import org.example.data.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ServiceCount <T extends Shape> {
    ServiceCircle circle = new ServiceCircle();
    ServiceRectangle rectangle = new ServiceRectangle();
    ServiceTriangle triangle = new ServiceTriangle();
    List<T> listShape = new ArrayList<>();

    public List<T> addShape(T shape) {
        listShape.add(shape);
        return listShape;
    }

    public Double getAllLenght(List<T> shapes) {
        Double lenght = 0.0;
        for (T shape : shapes) {
            if (shape.getClass() == Circle.class) {
                lenght = lenght + circle.lenght(((Circle) shape).getRadius());
            }
            if (shape.getClass() == Rectangle.class) {
                lenght = lenght + rectangle.lenght(((Rectangle) shape).getFirstSide(),
                        ((Rectangle) shape).getSecondSide());
            }
            if (shape.getClass() == Triangle.class) {
                lenght = lenght + triangle.lenght(((Triangle) shape).getFirstSide(),
                        ((Triangle) shape).getSecondSide(), ((Triangle) shape).getThirdSide());
            }
        }
        return lenght;
    }
    public Double getAllArea(List<T> shapes) {
        Double area = 0.0;
        for (T shape : shapes) {
            if (shape.getClass() == Circle.class) {
                 area = area + circle.area(((Circle) shape).getRadius());
            }
            if (shape.getClass() == Rectangle.class) {
                area = area + rectangle.area(((Rectangle) shape).getFirstSide(),
                        ((Rectangle) shape).getSecondSide());
            }
            if (shape.getClass() == Triangle.class) {
                area = area + triangle.area(((Triangle) shape).getFirstSide(),
                        ((Triangle) shape).getSecondSide(), ((Triangle) shape).getThirdSide());
            }
        }
        return area;
    }
}
