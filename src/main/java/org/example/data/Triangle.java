package org.example.data;



public class Triangle extends Poligon  {
    private Integer firstSide;
    private Integer secondSide;
    private Integer thirdSide;


    public Triangle(Integer area, Integer firstSide, Integer secondSide, Integer thirdSide) {
        super(area);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Integer getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(Integer firstSide) {
        this.firstSide = firstSide;
    }

    public Integer getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Integer secondSide) {
        this.secondSide = secondSide;
    }

    public Integer getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(Integer thirdSide) {
        this.thirdSide = thirdSide;
    }

//    @Override
//    public Integer perimeter(){
//        return firstSide+secondSide+thirdSide;
//    }


}
