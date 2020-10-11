package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public
class BookService {

    private List<BookDto> books = new ArrayList<>();

    @GetMapping
    public List<BookDto> getBooks() {
        return books;
    }

    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {
        books.add(bookDto);
    }

    @DeleteMapping
    @ResponseBody
    public void removeBook(@RequestParam int index) {
        books.remove(index);
    }

}
