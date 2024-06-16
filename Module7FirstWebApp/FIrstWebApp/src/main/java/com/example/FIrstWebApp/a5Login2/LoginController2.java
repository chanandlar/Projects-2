package com.example.FIrstWebApp.a5Login2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController2 {
    private AuthenticationService authenticationService;

    public LoginController2(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login1",method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "Login";
    }

    @RequestMapping(value="login1",method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
        if(authenticationService.authenticate(name,password)){
            model.put("name",name);
            model.put("password",password);
            //Authorization
            //name-Shoeb
            //password-test
            return "welcome";
        }
        String message="Invalid creds";
        model.put("error-message",message);
        return "Login";
    }
}
