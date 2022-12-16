package org.example.Service;

import org.example.data.Poligon;

public class ServiceRectangle <T extends Poligon> implements ServiceShape{


    @Override
    public Double area(Integer... sides) {
        Double area = 1.0;
        for (Integer side: sides) {
            area=area*side;
        }
        return area;
    }

    @Override
    public Double lenght(Integer... sides) {
        Double perimeter = 0.0;
        for (Integer side: sides) {
            perimeter+=side;
        }
        return perimeter;
    }
}
