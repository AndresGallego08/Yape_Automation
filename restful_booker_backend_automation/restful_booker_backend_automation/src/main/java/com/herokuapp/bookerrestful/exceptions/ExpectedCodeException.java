package com.herokuapp.bookerrestful.exceptions;

public class ExpectedCodeException extends AssertionError{

    public ExpectedCodeException(String message, Throwable cause) {
        super(message, cause);
    }
}
