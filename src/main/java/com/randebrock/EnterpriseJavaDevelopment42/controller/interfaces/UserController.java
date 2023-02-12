package com.randebrock.EnterpriseJavaDevelopment42.controller.interfaces;


//import com.example.demosecurityjwt.model.User;

import com.randebrock.EnterpriseJavaDevelopment42.model.User;

import java.util.List;

public interface UserController {

    List<User> getUsers();
    void saveUser(User user);

}
