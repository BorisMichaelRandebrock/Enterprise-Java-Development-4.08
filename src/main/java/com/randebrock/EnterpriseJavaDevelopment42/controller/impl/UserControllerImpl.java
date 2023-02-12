package com.randebrock.EnterpriseJavaDevelopment42.controller.impl;

//import com.example.demosecurityjwt.controller.interfaces.UserController;
//import com.example.demosecurityjwt.model.User;
//import com.example.demosecurityjwt.service.interfaces.UserService;
import com.randebrock.EnterpriseJavaDevelopment42.controller.interfaces.UserController;
import com.randebrock.EnterpriseJavaDevelopment42.model.User;
import com.randebrock.EnterpriseJavaDevelopment42.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
