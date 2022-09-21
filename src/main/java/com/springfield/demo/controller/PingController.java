package com.springfield.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    
    @GetMapping("/")
    public String HelloWorld() {
        return "HelloWorld!";
    }

    @GetMapping("/ping")
    public String Ping() {
        return "pong";
    }
}
