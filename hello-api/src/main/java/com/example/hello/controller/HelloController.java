package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {

    @GetMapping
    public String PrintHello() {
        return "Hello world";
    }

    @GetMapping("/{name}")
    public String PrintName(@PathVariable String name) {
        return "Hello, " + name;
    }
}
