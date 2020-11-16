package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneralShapesListApplicationTest {

    List<Shape> shapes = new LinkedList<>();
    Square sq1 = new Square(10);

    @Test
    public void addsShapeToLinkedList() {
        shapes.add(sq1);
        assertEquals(1,shapes.size());
    }

}