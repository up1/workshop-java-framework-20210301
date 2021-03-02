package com.example.kbtg.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getInfo(int id) {
        Optional<MyUser> user = userRepository.findById(id);
        if(user.isPresent()) {
            // Success
            return new UserResponse(id, user.get().getName(), user.get().getAge());
        }
        // Fail
        throw new UserNotFoundException("User not found id="+ id);
    }
}
