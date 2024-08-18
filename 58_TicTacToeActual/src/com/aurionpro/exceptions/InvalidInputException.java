package com.aurionpro.exceptions;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super("Invalid Cell Location");
    }
}
