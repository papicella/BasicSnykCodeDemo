package com.example.basiccodedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping ("/")
    public String sayHello () {
        return "hello";
    }

    @GetMapping ("/password")
    public String showPassword () {
        return helloService.getPassword();
    }

}
