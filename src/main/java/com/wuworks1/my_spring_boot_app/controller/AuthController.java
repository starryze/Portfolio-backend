package com.wuworks1.my_spring_boot_app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {"https://wuworks1-7d47439538fc.herokuapp.com/", "http://localhost:5173", "https://wuworks1-7d47439538fc.herokuapp.com/admin"})
public class AuthController {

    @Value("${ADMIN_PASSWORD}")
    private String adminPassword;

    @PostMapping("/login")
    public boolean login(@RequestBody String password) {
        return adminPassword.equals(password);
    }
}
