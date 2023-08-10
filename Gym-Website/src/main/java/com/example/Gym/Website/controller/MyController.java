package com.example.Gym.Website.controller;

import com.example.Gym.Website.services.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MyController {
    @Autowired
    private LoginService loginService;
    @GetMapping ("/")
    public String home(HttpSession session){
        String useremail = (String) session.getAttribute("useremail");
        boolean isUserLogin = useremail != null;
        if(isUserLogin){
            return "index";

        }
        return "Login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "Login";


    }


}
