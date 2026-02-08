package com.example.studentmanagercrud.exception;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {

        super(message);
    }
}
