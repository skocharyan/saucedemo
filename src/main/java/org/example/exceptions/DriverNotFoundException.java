package org.example.exceptions;

public class DriverNotFoundException extends Exception {
    public DriverNotFoundException(String message ) {
        super(message);
    }

    public DriverNotFoundException() {
        super("such a driver do not found ");
    }
}
