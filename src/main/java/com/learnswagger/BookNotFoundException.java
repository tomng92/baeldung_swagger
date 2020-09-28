package com.learnswagger;

public class BookNotFoundException extends RuntimeException {
    private long id;

    public BookNotFoundException(Long id) {
        super("Book not found "+ id + "!!!!");
        this.id = id;

    }

}
