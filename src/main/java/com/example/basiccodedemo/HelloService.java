package com.example.basiccodedemo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private String username = "admin";
    private String password = "shwhehe67whd!";

    public String getPassword () {
        return password;
    }
}
