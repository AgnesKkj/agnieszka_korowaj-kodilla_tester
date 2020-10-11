package com.kodilla.rest.domain;

import java.util.Objects;

public class BookDto {
    private String title;
    private String author;

    public BookDto() {

    }

    public BookDto(String title, String author) {
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
        BookDto bookDto = (BookDto) o;
        return getTitle().equals(bookDto.getTitle()) &&
                getAuthor().equals(bookDto.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }

    @Override
    public String toString() {
        return "BookDto: " +
                title + ", " + author;
    }
}
