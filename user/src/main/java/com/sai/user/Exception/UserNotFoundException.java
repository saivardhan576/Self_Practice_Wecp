package com.sai.user.Exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String id){
        super(id);
    }
}
