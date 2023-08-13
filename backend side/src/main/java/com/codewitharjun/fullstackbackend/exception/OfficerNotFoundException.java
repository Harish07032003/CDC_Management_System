package com.codewitharjun.fullstackbackend.exception;

public class OfficerNotFoundException extends RuntimeException{
    public OfficerNotFoundException (Long id){
        super("Could not found the officer with id"+(id));
    }
}
