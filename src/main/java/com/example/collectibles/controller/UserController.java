package com.example.collectibles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/newUser")
    public String displayRegistrationForm() {
        return "register-user";
    }
}
