package com.revature.revagenda_backend.exceptions;

public class UsernameNotUniqueException extends Exception {
    public UsernameNotUniqueException(String msg) {
        super(msg);
    }
}
