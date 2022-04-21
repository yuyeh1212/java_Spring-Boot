package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @RequestMapping("/test")
    public String test(){
        System.out.println("Hi!!!");
        return "Hello world";
    }
}