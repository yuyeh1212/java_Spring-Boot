package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                        @RequestParam String name){
        System.out.println("id:"+ id);
        System.out.println("name:"+ name);
        return "Hello test1!!";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student){
        System.out.println("student id:" +student.getId());
        System.out.println("student name:" +student.getName());
        return "Hello test2!!";
    }

    @RequestMapping("/test3")
    public String test3(@RequestHeader String info){
        System.out.println("header info:" + info);
        return "Hello test3!!";
    }

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,
                        @PathVariable String name){
        System.out.println("path id:" +id);
        System.out.println("path name:" +name);
        return "Hello test4!!";
    }
}
