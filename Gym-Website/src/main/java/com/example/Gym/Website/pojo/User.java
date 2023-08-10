package com.example.Gym.Website.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "usertables")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private  int userid;
    @Column(name = "username")
    private  String username;
    @Column(name = "userpassword")
    private String password;
    @Column(name = "useremail")

    private String userEmail;




}

