package com.codewitharjun.fullstackbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.*;

@ControllerAdvice
public class OfficerNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(OfficerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionhandler(OfficerNotFoundException exception){
        Map<String,String> errormap=new HashMap<>();
        errormap.put("errormessage",exception.getMessage());
        return errormap;
    }
}
