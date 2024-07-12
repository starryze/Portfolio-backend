package com.wuworks1.my_spring_boot_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FallbackController {

    @GetMapping("/admin")
    public String admin() {
        return "feedback";
    }
}
