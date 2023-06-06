package com.example.demo.controller;

import com.example.demo.dto.Response;
import com.example.demo.exception.VirtualAccountNotfoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author galang
 */
@ControllerAdvice
public class GlobalController {

    @ExceptionHandler(value = VirtualAccountNotfoundException.class)
    public ResponseEntity<Object> exception(VirtualAccountNotfoundException exception) {
        Response response = Response.builder()
                .responseCode("01")
                .responseMessage(exception.getMessage()) // ambil message dari exception
//                .responseMessage("Virtucal Account Not Found !") // hardcode message
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}