package com.example.springbootcrud.service;

import com.example.springbootcrud.dto.BookRequest;
import com.example.springbootcrud.entity.Book;
import com.example.springbootcrud.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository ;

    public List<Book> getAllBooks () {
        return bookRepository.findAll() ;

    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sách với ID: " + id));
    }
    @Transactional
    public Book createBook(BookRequest request) {
        Book book = Book.builder()
                .title(request.title())
                .author(request.author())
                .price(request.price())
                .build() ;
        return bookRepository.save(book) ;

    }

    @Transactional
    public Book updateBook(Long id, BookRequest request) {
        Book existingBook = getBookById(id) ;
        
        existingBook.setTitle(request.title());
        existingBook.setAuthor(request.author());
        existingBook.setPrice(request.price());
        
        return bookRepository.save(existingBook);
    }

    @Transactional
    public void deleteBook(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new RuntimeException("Không thể xóa! Không tìm thấy sách ID: " + id);
        }
        bookRepository.deleteById(id);
    }

}
