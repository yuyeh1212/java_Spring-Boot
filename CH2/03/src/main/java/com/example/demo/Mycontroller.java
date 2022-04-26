package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @Autowired
    @Qualifier("canonPrinter")
    private Printer printer;


    @RequestMapping("/test")
    public String test(){
        printer.print("Hello world");
        return "Hello world";
    }
}