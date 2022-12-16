package org.example.IController;


import org.example.Service.ServiceCircle;
import org.example.Service.ServiceCount;
import org.example.data.Shape;

import java.util.List;

public class Controller <T extends Shape> {

    ServiceCount service = new ServiceCount();

    public Double getAllLenght(List<T> shapes){
         return service.getAllLenght(shapes);

    }

    public Double getAllArea(List<T> shapes){
        return service.getAllArea(shapes);
    }
}
