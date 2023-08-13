package com.codewitharjun.fullstackbackend.model;

public class LoginRequest {
    public String username;
    public String password;

    LoginRequest(String username, String password){
        this.username = username;
        this.password = password;
    }
}
