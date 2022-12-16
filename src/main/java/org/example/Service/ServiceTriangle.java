package org.example.Service;

import org.example.data.Triangle;

public class ServiceTriangle <T extends Triangle> implements ServiceShape {
    Double perimeter=0.0;

    public ServiceTriangle() {
        this.perimeter = perimeter;
    }

    @Override
    public Double lenght(Integer... sides) {
        for (Integer side: sides) {
            perimeter+=side;
        }
        return perimeter;
    }
    @Override
    public Double area(Integer... sides) {
        Double p = lenght();
        Double s = (Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2])));
        return s;
    }


}
