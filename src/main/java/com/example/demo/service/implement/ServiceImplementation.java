package com.example.demo.service.implement;

import com.example.demo.Repository.BookRepository;
import com.example.demo.model.Book;
import com.example.demo.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImplementation implements BookServices {

    private BookRepository bookRepo;

    @Autowired
    ServiceImplementation(BookRepository bookRepo){
        this.bookRepo=bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("The Book you are looking for cannot be found"));
    }
}
