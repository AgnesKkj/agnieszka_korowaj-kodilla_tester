package com.kodilla.collections.adv.immutable.special.homework;
public class BookApplication {
    public static void main(String[] args) {
        //część 1, tworzenie obiektów bez kolekcji
        BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        //BookManager.createBook("Catcher in the Rye", "J.D. Salinger");
        //BookManager.createBook("Catcher in the Rye", "J.D. Salinger");
        Book bookOne = new Book("Catcher in the Rye", "J.D. Salinger");
        BookManager.bookDirectory.add(bookOne);
        Book bookTwo = new Book("Catcher in the Rye", "J.D. Salinger");
        BookManager.bookDirectory.add(bookTwo);

        //część 2, dodajemy kolekcję w BookManager
        System.out.println("All tokens: " + BookManager.bookDirectory);
        System.out.println("Directory size: " + BookManager.bookDirectory.size());

        //część 3, porównanie wg ==
        System.out.println("Do they have the same values?");
        System.out.println(bookOne.equals(bookTwo));
        if(bookOne.equals(bookTwo)) {
            System.out.println("Are they the same book?");
            System.out.println(bookOne == bookTwo);
        }
    }
}