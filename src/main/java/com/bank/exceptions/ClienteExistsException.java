package com.bank.exceptions;

public class ClienteExistsException extends RuntimeException {
    public ClienteExistsException() {
        super("Esse cliente já existe.");
    }
    public ClienteExistsException(String message){
        super(message);
    }
}
