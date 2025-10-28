package org.example.Exceptions;

public class InvalidCustomerEmailException extends RuntimeException {
    public InvalidCustomerEmailException(String message) {
        super(message);
    }
}
