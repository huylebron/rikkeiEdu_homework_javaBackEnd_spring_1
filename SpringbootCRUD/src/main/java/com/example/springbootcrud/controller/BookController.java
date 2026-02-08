package com.example.springbootcrud.controller;

import com.example.springbootcrud.dto.BookRequest;
import com.example.springbootcrud.entity.Book;
import com.example.springbootcrud.repository.BookRepository;
import com.example.springbootcrud.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor

public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAllBooks();

    }
    @GetMapping("/{id}")
    public  ResponseEntity<Book> getById (@PathVariable Long id ) {
        return ResponseEntity.ok(bookService.getBookById(id)) ;

    }
    @PostMapping
    public ResponseEntity<Book> create(@Valid @RequestBody BookRequest request) {
        return new ResponseEntity<>(bookService.createBook(request), HttpStatus.CREATED);

    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> update (@PathVariable Long id , @Valid @RequestBody BookRequest request) {

        return ResponseEntity.ok(bookService.updateBook(id, request));


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();


    }



}
