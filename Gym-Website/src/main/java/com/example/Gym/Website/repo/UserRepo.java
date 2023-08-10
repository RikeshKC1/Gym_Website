package com.example.Gym.Website.repo;

import com.example.Gym.Website.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepo extends CrudRepository<User,Integer> {
    List<User> findByUserEmail(String userEmail);




}
