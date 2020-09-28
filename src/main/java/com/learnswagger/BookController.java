package com.learnswagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/{id}")
//    @ExceptionHandler(BookNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Book findById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
//        throw new BookNotFoundException(id);
    }


    @GetMapping("/")
    public Collection<Book> findBooks() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(
            @PathVariable("id") final String id, @RequestBody final Book book) {
        return book;
    }
}