package com.randebrock.EnterpriseJavaDevelopment42.service.interfaces;

//import com.example.demosecurityjwt.model.User;

import com.randebrock.EnterpriseJavaDevelopment42.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> getUsers();

}
