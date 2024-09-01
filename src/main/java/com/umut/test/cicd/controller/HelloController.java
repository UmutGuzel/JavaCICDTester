package com.umut.test.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    private String getHello(){
       return "<h1>Hello</h1>";
    }
}
