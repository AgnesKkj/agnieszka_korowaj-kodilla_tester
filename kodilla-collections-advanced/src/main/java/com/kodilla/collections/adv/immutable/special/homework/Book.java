package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class Book {
    private String title;
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

        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTitle(), getAuthor());
    }

    @Override
        public String toString() {

        return "title: " + title + ", author: " + author;

        }
}

