package com.springfield.demo.controller;

import com.springfield.demo.entity.Transport;
import com.springfield.demo.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PingController {

    @GetMapping("/")
    public String HelloWorld() {
        return "HelloWorld!";
    }

    @Autowired
    private TransportRepository transportRepository;

    @GetMapping("select")
    public List<Transport> selectAll() {
        return transportRepository.findAll();
    }

    @GetMapping("/ping")
    public String Ping() {
        return "pong";
    }
}
