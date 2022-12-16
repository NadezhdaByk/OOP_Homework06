package org.example.Service;

import org.example.data.Circle;
import org.example.data.Shape;

import java.util.List;

public class ServiceCircle <T extends Circle> implements ServiceShape {

     @Override
     public Double lenght(Integer... sides) {
          return 2*3.14*sides[0];
     }

     @Override
     public Double area(Integer... sides) {
          return 3.14*sides[0]*2;
     }



}
