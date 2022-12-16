package org.example.data;



public class Rectangle extends Poligon{
    private Integer firstSide;
    private Integer secondSide;

    public Rectangle(Integer area, Integer firstSide, Integer secondSide) {
        super(area);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Integer getFirstSide() {
        return firstSide;
    }

    public Integer getSecondSide() {
        return secondSide;
    }

    public void setFirstSide(Integer firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(Integer secondSide) {
        this.secondSide = secondSide;
    }


}
