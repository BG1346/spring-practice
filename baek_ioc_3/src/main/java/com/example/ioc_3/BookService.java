package com.example.ioc_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookService {
    BookRepository bookRepository;

//     생성자 사용한 autowired
//    @Autowired(required=false)
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    }

    // setter 사용한 autowired
    @Autowired(required = false)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
