package com.example.demo.Repository;

import com.example.demo.model.Book;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
