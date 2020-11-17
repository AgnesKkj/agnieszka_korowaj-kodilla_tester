package com.kodilla.collections.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ShapeApplicationTest {

    @Test
    public void testDrawShape() {
        System.out.println(ShapeApplication.drawShape());
        assertNotNull(ShapeApplication.drawShape());
    }

}