package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ShapeUtilsTest {

    ShapeUtils shapeUtils = Mockito.spy(ShapeUtils.class);
    Shape triangle = new Triangle(1.4,0.9,1.2);

    @Test
    public void mockDisplayShapeInfo() {
        Mockito.verify(shapeUtils).displayShapeInfo(triangle);
    }


}