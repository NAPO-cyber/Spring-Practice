package com.example.books.service;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepo.finById(id);
    }

    public Book updateBook(Long id, Book book) {
        Book existingBook = bookRepo.finById(id);

        if (existingBook == null) {
            return null;
        }
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());

        return bookRepo.save(existingBook);
    }

    public boolean deleteBook(Long id) {
        Book book = bookRepo.finById(id);

        if (book == null) {
            return false;
        }
        bookRepo.deleteById(id);
        return true;
    }

    public boolean clearBooks() {
        List<Book> book = bookRepo.findAll();

        if (book.isEmpty()) {
            return false;
        }
        bookRepo.clear();
        return true;
    }
}
