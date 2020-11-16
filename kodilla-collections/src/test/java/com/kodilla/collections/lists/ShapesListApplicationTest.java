package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapesListApplicationTest {

    List<Square> shapes = new ArrayList<>();
    Square sq1 = new Square(10);

    @Test
    public void addsShape() {
        shapes.add(sq1);
        assertEquals(1,shapes.size());
    }

}