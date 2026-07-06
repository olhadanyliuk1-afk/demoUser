package org.example.demouser.controller;

import org.example.demouser.controller.exception.EmailAlreadyExistException;
import org.example.demouser.controller.exception.UserIdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserIdNotFoundException.class)
    public ResponseEntity<String> handleUserIdNotFoundException(UserIdNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(EmailAlreadyExistException.class)
    public ResponseEntity<String> handleEmailAlreadyExistException(EmailAlreadyExistException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }
}
