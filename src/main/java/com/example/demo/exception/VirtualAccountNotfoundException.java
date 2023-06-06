package com.example.demo.exception;

/**
 * @author galang
 */
public class VirtualAccountNotfoundException extends RuntimeException {

    public VirtualAccountNotfoundException(){}

    public VirtualAccountNotfoundException(String message) {
        super(message);
    }
}
