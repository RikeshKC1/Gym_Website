package com.example.Gym.Website.controller;

import com.example.Gym.Website.pojo.User;
import com.example.Gym.Website.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {
    @Autowired
    private UserRepo userRepo;


    @GetMapping("/signup")
    public String home(){
        return "signup";

    }
    @PostMapping("/signupdata")
    public String signupdata(@RequestParam("username") String username,@RequestParam("useremail") String useremail,@RequestParam("userpassword") String userpassword){
        User userdata= new User();
        userdata.setUsername(username);
        userdata.setUserEmail(useremail);
        userdata.setPassword(userpassword);
        userRepo.save(userdata);
        return "redirect:/";


    }

    }



