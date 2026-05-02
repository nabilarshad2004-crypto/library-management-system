package com.nabil.library.service;

import com.nabil.library.entity.Book;
import com.nabil.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book save(Book book) {
        return repo.save(book);
    }
}
