package com.example.collectibles.controller;

import com.example.collectibles.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/newUser")
    public String displayRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register-user";
    }
}
