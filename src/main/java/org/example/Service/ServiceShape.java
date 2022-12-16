package org.example.Service;

import java.awt.*;

public interface ServiceShape <T extends Shape> {
    Double area(Integer... sides);
    Double lenght(Integer... sides);

}
