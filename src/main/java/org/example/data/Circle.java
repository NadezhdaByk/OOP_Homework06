package org.example.data;

import org.example.Service.ServiceCircle;

public class Circle extends Shape {
    private Integer radius;

    public Circle(Integer area, Integer radius) {
        super(area);
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }


}
