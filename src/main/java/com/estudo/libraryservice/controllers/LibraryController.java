package com.estudo.libraryservice.controllers;

import com.estudo.libraryservice.api.BooksApi;
import com.estudo.libraryservice.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements BooksApi {



    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();
        Book book = new Book();
        book.setName("My Book");
        book.setAuthor("Myself");
        books.add(book);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
