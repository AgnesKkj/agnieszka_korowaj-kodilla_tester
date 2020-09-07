package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    //kazali tworzyć metodą, nie konstruktorem

    public static List<Book> temporaryBookDirectory = new ArrayList<>();
    public static List<Book> bookDirectory = new ArrayList<>();

        public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        //bookDirectory.add(book);
        //najlepiej byłoby obejść to HashSetem, ale w poleceniu chcą sprawdzanie duplikatów
        if (bookDirectory.contains(book) == false) {
            bookDirectory.add(book);
            System.out.println("Adding to directory");
        }
        else {
            System.out.println("The book is already in the directory.");
        }
        return book;
    }

    public void getIndex() {
        for(int i = 0; i < BookManager.bookDirectory.size(); i++) {
            bookDirectory.get(i);
        }
    }
}


