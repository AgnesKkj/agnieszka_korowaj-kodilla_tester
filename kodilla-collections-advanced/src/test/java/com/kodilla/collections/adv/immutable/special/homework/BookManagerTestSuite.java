package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTestSuite {

    public List<Book> bookDirectory = new ArrayList<>();

    @Test
    public void testCreateBook() {
        Book bookOne = BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        assertNotNull(bookOne);
    }

    @Test
    public void testAddToBookDirectory() {
        Book bookOne = BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        bookDirectory.add(bookOne);
        assertEquals(1,bookDirectory.size());
    }

    //coś nie wychodzi z metodą Equals w tym pakiecie
    @Test
    public void testTwoBooksWithSameValuesAreNotTheSameBook() {
        Book bookOne = BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        bookDirectory.add(bookOne);
        Book bookTwo = BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        bookDirectory.add(bookTwo);

        assertEquals(bookOne, bookTwo);
        assertNotSame(bookOne, bookTwo);
    }


}