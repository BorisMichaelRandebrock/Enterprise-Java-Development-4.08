package com.randebrock.EnterpriseJavaDevelopment42.controller.impl;

//import com.example.demosecurityjwt.controller.dto.ResponseDTO;
//import com.example.demosecurityjwt.controller.interfaces.HelloWorldController;
import com.randebrock.EnterpriseJavaDevelopment42.controller.dto.ResponseDTO;
import com.randebrock.EnterpriseJavaDevelopment42.controller.interfaces.HelloWorldController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Optional;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

    @GetMapping("/hello/anon") // Public route
    public ResponseDTO helloAnon(Optional<String> name) {

        ResponseDTO responseDTO = new ResponseDTO();
        if(name.isPresent()) {
            responseDTO.setMessage("Hello, " + name.get());
        } else {
            responseDTO.setMessage("Hello Anon");
        }

        return responseDTO;
    }

    @GetMapping("/hello/user") // Protected route. Users with ADMIN or USER role can access
    public ResponseDTO helloUser() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Hello User");
        return responseDTO;
    }

    @GetMapping("/hello/admin") // Protected route. Users with ADMIN role can access
    public ResponseDTO helloAdmin(Authentication authentication) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Hello Admin " + authentication.getName());
        return responseDTO;
    }

    @GetMapping("/curses/{xx}/department") // Protected route. Users with ADMIN role can access
    public ResponseDTO helloX(@PathVariable String xx) throws ParseException {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Hello " + xx);


        return responseDTO;
    }
}
