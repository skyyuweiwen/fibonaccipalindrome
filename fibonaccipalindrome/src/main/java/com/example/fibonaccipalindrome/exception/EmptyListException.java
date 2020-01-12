package com.example.fibonaccipalindrome.exception;

/**
 * Exception for empty list.
 */
public class EmptyListException extends RuntimeException {
    public EmptyListException(){
    }

    public EmptyListException(final String message) {
        super(message);
    }

    public EmptyListException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public EmptyListException(final Throwable cause) {
        super(cause);
    }

}
