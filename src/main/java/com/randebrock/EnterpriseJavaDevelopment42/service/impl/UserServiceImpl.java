package com.randebrock.EnterpriseJavaDevelopment42.service.impl;

//import com.example.demosecurityjwt.model.User;
//import com.example.demosecurityjwt.repository.UserRepository;
//import com.example.demosecurityjwt.service.interfaces.UserService;
import com.randebrock.EnterpriseJavaDevelopment42.model.User;
import com.randebrock.EnterpriseJavaDevelopment42.repository.UserRepository;
import com.randebrock.EnterpriseJavaDevelopment42.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        // Encode the user's password for security before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
