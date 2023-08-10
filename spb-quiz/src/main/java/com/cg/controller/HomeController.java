package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("/quiz")
    public String showHomePage() {
        return "/home/quiz";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
