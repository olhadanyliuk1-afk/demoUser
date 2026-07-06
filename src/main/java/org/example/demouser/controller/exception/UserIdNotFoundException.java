package org.example.demouser.controller.exception;

public class UserIdNotFoundException extends RuntimeException{
    public UserIdNotFoundException(String message) {
        super(message);
    }
}
