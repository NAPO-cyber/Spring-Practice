package com.example.validation.controller;

import com.example.validation.dto.UserReq;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/register")
public class UserController {

    @PostMapping
    public String register (@Valid @RequestBody UserReq userReq) {
        return "user registered successfully...";
    }
}
