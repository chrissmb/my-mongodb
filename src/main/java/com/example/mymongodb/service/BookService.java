package com.example.mymongodb.service;

import com.example.mymongodb.model.Book;
import com.example.mymongodb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final static int PAGE_SIZE = 3;
    @Autowired
    BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Page<Book> findByTitle(int page, String title) {
        Pageable pageable = PageRequest.of(page, PAGE_SIZE, Sort.by("title").ascending());
        return bookRepository.findByTitle(title, pageable);
    }

    public Book getOne(String id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public void delete(String id) {
        bookRepository.deleteById(id);
    }
}
