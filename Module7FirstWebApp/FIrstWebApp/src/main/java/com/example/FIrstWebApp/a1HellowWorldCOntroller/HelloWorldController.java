package com.example.FIrstWebApp.a1HellowWorldCOntroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("say-hello")
    public String helloWorld(){
        return "Hello World";
    }

}
