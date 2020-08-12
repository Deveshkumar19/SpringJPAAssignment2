package com.devesh.SpringAssignment.Exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String exception) {
        super(exception);
    }
}
