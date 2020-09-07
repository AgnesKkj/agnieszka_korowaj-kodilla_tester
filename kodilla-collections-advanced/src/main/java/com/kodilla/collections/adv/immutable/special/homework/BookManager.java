package com.kodilla.collections.adv.immutable.special.homework;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    //kazali tworzyć metodą, nie konstruktorem
    public static List<Book> bookDirectory = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        //bookDirectory.add(book);
        if (bookDirectory.contains(book) == false) {
            System.out.println("The book wasn't in the directory.");
            bookDirectory.add(book);
        } else {
            System.out.println("The book is already in the directory.");
            bookDirectory.add(book);
        }
        System.out.println(new Book(title, author));
        System.out.println(new Book(title, author).hashCode());
        return book;
    }

    public void getIndex() {
        for (int i = 0; i < BookManager.bookDirectory.size(); i++) {
            bookDirectory.get(i);
        }

    }

}