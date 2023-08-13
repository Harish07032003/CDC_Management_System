package com.codewitharjun.fullstackbackend.model;

public class DloginRequest {

        public String username;
        public String password;

        DloginRequest(String username, String password){
            this.username = username;
            this.password = password;
    }

}
