package com.wuworks1.my_spring_boot_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Ensure you have an index.html file in the templates folder
    }
}
