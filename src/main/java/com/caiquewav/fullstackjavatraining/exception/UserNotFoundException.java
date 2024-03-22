package com.caiquewav.fullstackjavatraining.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("Could not founde the user with id" + id);
    }
}
