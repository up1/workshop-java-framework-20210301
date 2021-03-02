package com.example.kbtg.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/user/{id}")
    public UserResponse getUserBy(@PathVariable int id) {
        UserResponse userResponse = userService.getInfo(id);
        return userResponse;
    }

}
