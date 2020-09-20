package com.kodilla.execution_model;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item itemOne = new Item("chair", 250.50);
    Item itemTwo = new Item("table", 500.00);
    Item itemThree = new Item("carpet", 400.75);

    @Test
    public void shouldAddItemsToInvoice() {
        System.out.println("Should add items to invoice");
        System.out.println("Invoice size: " + invoice.getSize());
        assertEquals(3,invoice.getSize());
    }

    //does return item when list.size()  0
    @Test
    public void shouldReturnItemWhenListSizeAboveZero() {
        System.out.println("Should return items when list.size() > 0");
        System.out.println(invoice.getItem(0));
        System.out.println(invoice.getItem(1));
        System.out.println(invoice.getItem(2));
        assertEquals(itemOne, invoice.getItem(0));
        assertEquals(itemTwo, invoice.getItem(1));
        assertEquals(itemThree, invoice.getItem(2));
    }

       //does return null when trying to get an item with negative index
    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        System.out.println("Should return null when calling a negative index");
        System.out.println(invoice.getItem(-2));
        assertEquals(null, invoice.getItem(-2));
    }


    @Test
    public void shouldReturnNullWhenPassingOutOfBoundIndex() {
        System.out.println("Should return null when calling an index out of bounds");
        System.out.println(invoice.getItem(7));
        assertEquals(null, invoice.getItem(7));
    }

    //does clear when list.size > 0
    @Test
    public void shouldClearListWhenSizeAboveZero() {
        System.out.println("Should clear the list when list.size() > 0");
        System.out.println("Clearing.");
        invoice.clear();
        System.out.println("Invoice size: " + invoice.getSize());
        assertEquals(0, invoice.getSize());
    }

    @Test
    public void shouldReturnZeroWhenClearingEmptyList() {
        System.out.println("Should return null when clearing empty list");
        System.out.println("Clearing.");
        invoice.clear();
        System.out.println("Invoice size: " + invoice.getSize());
        assertEquals(0, invoice.getSize());
    }

    @Test
    public void shouldReturnExceptionOrNullWhenClearingNegativeInAnEmptyList() {
        System.out.println("Should return null or exception when calling negative index from an empty list");
        System.out.println("Clearing.");
        invoice.clear();
        System.out.println("Invoice size: " + invoice.getSize());
        System.out.println("Clearing result: " + invoice.getItem(-2));
        assertEquals(null,invoice.getItem(0));
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(itemOne);
        invoice.addItem(itemTwo);
        invoice.addItem(itemThree);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}