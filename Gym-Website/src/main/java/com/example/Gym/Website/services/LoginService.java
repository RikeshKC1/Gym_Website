package com.example.Gym.Website.services;

import com.example.Gym.Website.pojo.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LoginService {
    public boolean validUser(List<User> users,String password){
        String userpassword=null;
        for (User user:users){
            userpassword=user.getPassword();

            System.out.println(userpassword);


        }
        if(userpassword.equals(password)){
            return true;
        }
        return false;



    }

    public boolean isUserLogin(HttpSession session){
        String useremail = (String) session.getAttribute("useremail");
        return useremail != null;


    }
}
