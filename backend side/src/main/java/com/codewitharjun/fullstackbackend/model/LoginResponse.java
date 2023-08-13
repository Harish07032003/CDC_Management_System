package com.codewitharjun.fullstackbackend.model;

public class LoginResponse {
    Boolean success;
    String message;
    public LoginResponse(Boolean success, String message){
        this.message = message;
        this.success = success;
    }
}
