package com.example.FIrstWebApp.a3HelloWorldJSP;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldJSPController {
    @RequestMapping("say-hello-jsp")
    public String gotoLoginPage(){
        return "sayHello";
    }
}
