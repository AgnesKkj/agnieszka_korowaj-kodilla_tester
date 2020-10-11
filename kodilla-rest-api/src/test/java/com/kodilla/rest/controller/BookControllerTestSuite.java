package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTestSuite {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);
    List<BookDto> booksList = new ArrayList<>();

    @Test
    public void shouldFetchBooks() {
        //given
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooksUsingAddBookMethodFromController() {
        //given
        Mockito.when(bookController.getBooks()).thenReturn(booksList);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        bookController.addBook(new BookDto("title 1", "author 1"));
        bookController.addBook(new BookDto("title 2", "author 2"));
        //when
        List<BookDto> result = bookController.getBooks();
        System.out.println(bookController.getBooks());
        //then
        Mockito.verify(bookServiceMock).addBook(new BookDto("title 1", "author 1"));
        Mockito.verify(bookServiceMock).addBook(new BookDto("title 2", "author 2"));
    }

    @Test
    public void shouldIncreaseListSizeWHenUsingAddBookMethodFromController() {
        //given
        Mockito.when(bookController.getBooks()).thenReturn(booksList);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        bookController.addBook(new BookDto("title 1", "author 1"));
        bookController.addBook(new BookDto("title 2", "author 2"));
        //when
        List<BookDto> result = bookController.getBooks();
        System.out.println(bookController.getBooks());
        //then
        assertThat(result).hasSize(2);
    }

}