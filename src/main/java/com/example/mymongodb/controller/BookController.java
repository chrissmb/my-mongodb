package com.example.mymongodb.controller;

import com.example.mymongodb.model.Book;
import com.example.mymongodb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping()
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping()
    public Page<Book> findByTitle(@RequestParam int page, @RequestParam(required = false) String title) {
        return bookService.findByTitle(page, title);
    }

    @GetMapping("/{id}")
    public Book getOne(@PathVariable("id") String id) {
        return bookService.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        bookService.delete(id);
    }
}
