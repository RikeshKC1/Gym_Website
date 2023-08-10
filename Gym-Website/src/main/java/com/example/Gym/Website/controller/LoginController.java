package com.example.Gym.Website.controller;

import com.example.Gym.Website.pojo.User;
import com.example.Gym.Website.repo.UserRepo;
import com.example.Gym.Website.services.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String login(HttpSession session){
        String useremail = (String) session.getAttribute("useremail");
        boolean isUserLogin = useremail != null;
        if(!isUserLogin){

            return "login";

        }
        return "index";

    }


     @PostMapping("/loginData")
    public String loginData(@RequestParam("useremail") String useremail, @RequestParam("userpassword") String userpassword,HttpSession session){
        List<User> userdata=userRepo.findByUserEmail(useremail);
       boolean isValid= loginService.validUser(userdata,userpassword);
       if (isValid){
           session.setAttribute("useremail",useremail);

           return "redirect:/";
       }
       return "redirect:/login";



    }




}
