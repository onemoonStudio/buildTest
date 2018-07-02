package com.example.buildtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
    @GetMapping("/hello")
    public String hellocome(){
        return "hello world";
    }
}
