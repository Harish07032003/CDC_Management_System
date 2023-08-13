package com.codewitharjun.fullstackbackend.model;

public class DloginResponse {
    Boolean success;
    String message;
    public DloginResponse(Boolean success, String message){
        this.message = message;
        this.success = success;
    }
}
