package com.example.books.repository;

import com.example.books.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepo {

    private final Map<Long, Book> books = new HashMap<>();
    private Long nextId = 1L;

    public Book save(Book book) {
        if (book.getId() == null) {
            book.setId(nextId++);
        }

        books.put(book.getId(), book);
        return book;
    }

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    public Book finById(Long id) {
        return books.get(id);
    }

    public void deleteById(Long id) {
        books.remove(id);
    }

    public void clear() {
        books.clear();
    }
}
