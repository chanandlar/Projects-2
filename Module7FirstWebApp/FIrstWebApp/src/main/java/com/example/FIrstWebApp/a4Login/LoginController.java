package com.example.FIrstWebApp.a4Login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("login")
    public String helloWorld(){
        return "login";
    }
}
