package org.example.data;

public abstract class Shape {

    private Integer area;

    Shape(Integer area) {

        this.area = area;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}
