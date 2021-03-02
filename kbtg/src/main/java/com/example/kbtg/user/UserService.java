package com.example.kbtg.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse getInfo(int id) {
        if(id <= 10) {
            // Success
            return new UserResponse(id, "somkiat", 30);
        }
        // Fail
        throw new RuntimeException("User not found id="+ id);
    }
}
