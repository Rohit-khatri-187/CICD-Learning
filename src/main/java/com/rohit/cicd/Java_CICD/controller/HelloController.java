package com.rohit.cicd.Java_CICD.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String Hello(){
        return "Hello from CICD testng";
    }

}
