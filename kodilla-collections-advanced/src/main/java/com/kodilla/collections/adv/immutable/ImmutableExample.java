package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {

        Book book = new Book("John Stewart", "The Last Chance");
        //BookHacked bookHacked = (BookHacked) book;
        //bookHacked.modifyTitle("New Title");
        System.out.println(book.getTitle());

    }
}
