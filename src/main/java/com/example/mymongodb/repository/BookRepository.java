package com.example.mymongodb.repository;

import com.example.mymongodb.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

//    @Query(value = "{title: {$regex: '^?0.*', $options: 'mi'}}") // starts with
    @Query(value = "{title: {$regex: '?0.*', $options: 'i'}}") // contains
    public Page<Book> findByTitle(String title, Pageable pageable);
}
