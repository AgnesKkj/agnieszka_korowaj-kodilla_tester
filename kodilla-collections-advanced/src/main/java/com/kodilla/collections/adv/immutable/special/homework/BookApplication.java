package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        //część 1, tworzenie obiektów bez kolekcji
        BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        BookManager.createBook("Catcher in the Rye", "J.D. Salinger");
        BookManager.createBook("Catcher in the Rye", "J.D. Salinger");

        //część 2, dodajemy kolekcję w BookManager
        System.out.println("-----");
        System.out.println("Directory size: " + BookManager.bookDirectory.size());

        
        System.out.println("-----");
        System.out.println("Do objects have the same hashCodes?");
        System.out.println("0 and 1");
        System.out.println(BookManager.bookDirectory.get(0).equals(BookManager.bookDirectory.get(1)));
        System.out.println("1 and 2");
        System.out.println(BookManager.bookDirectory.get(1).equals(BookManager.bookDirectory.get(2)));
        System.out.println("0 and 2");
        System.out.println(BookManager.bookDirectory.get(0).equals(BookManager.bookDirectory.get(2)));
    }
}