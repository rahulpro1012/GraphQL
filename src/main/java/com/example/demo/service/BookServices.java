package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookServices {

    //create
    Book create(Book book);

    //getAll
    List<Book> getAll();

    //getOne
    Book get(int bookId);
}
