package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTestSuite {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    List<BookDto> booksList = new ArrayList<>();

    @Test
    public void shouldFetchBooks() throws Exception {
        //given
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);
        //when & then
        System.out.println(bookService.getBooks());
        mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBooksUsingAddBookMethodFromController() throws Exception {
        //given
        Gson gson = new Gson();
        Mockito.when(bookService.getBooks()).thenReturn(booksList);
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        System.out.println("First book from GSOn to JSON: " + gson.toJson(new BookDto("title 1", "author 1")));
        System.out.println("Second book from GSOn to JSON: " + gson.toJson(new BookDto("title 2", "author 2")));
        //when & then
        System.out.println(bookService.getBooks());
        mockMvc.perform(MockMvcRequestBuilders.post("/books").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(new BookDto("title 1", "author 1"))))
                .andExpect(MockMvcResultMatchers.status().is(200));
        mockMvc.perform(MockMvcRequestBuilders.post("/books").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(new BookDto("title 2", "author 2"))))
                .andExpect(MockMvcResultMatchers.status().is(200));
        mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

}
