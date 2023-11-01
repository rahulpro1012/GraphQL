package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookServices;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    BookServices bookServices;

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b1=new Book();
        b1.setName(book.getName());
        b1.setDesc(book.getDesc());
        b1.setAuth(book.getAuth());
        b1.setPrice(book.getPrice());
        return this.bookServices.create(b1);
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBooks() {
        return this.bookServices.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookServices.get(bookId);
    }


    @Getter
    @Setter
    static class BookInput{
        private String name;
        private String desc;
        private String auth;
        private double price;
    }
}
