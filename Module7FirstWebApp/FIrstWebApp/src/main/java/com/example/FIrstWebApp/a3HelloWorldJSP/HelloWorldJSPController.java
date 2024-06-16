package com.example.FIrstWebApp.a3HelloWorldJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldJSPController {
    @RequestMapping("say-hello-jsp")
    public String gotoLoginPage(){
        return "sayHello";
    }
}
