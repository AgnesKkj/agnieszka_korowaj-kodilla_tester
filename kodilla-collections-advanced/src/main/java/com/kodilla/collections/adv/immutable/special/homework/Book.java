package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class Book {
    String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

        public String getTitle() {
        return title;
        }

        public String getAuthor() {
        return author;
        }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
        author.equals(book.author);
        }

        @Override
        public int hashCode() {
        return Objects.hash(title, author);
        }

        @Override
        public String toString() {
        return "title: " + title + ", author: " + author;
        }
}

