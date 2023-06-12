package com.example.mymongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Document("book")
public class Book {

    @Id
    private String id;

    private String title;

    private List<String> genres;

    private String author;

    private Date launchDate;

    private BigDecimal price;
}
