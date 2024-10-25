package com.hexagonal.hexagonal_app.infrastructure.exception;

public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException() {
    }
    public ObjectNotFoundException(String message) {
        super(message);
    }
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
