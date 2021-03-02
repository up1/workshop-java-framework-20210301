package com.example.kbtg.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @AfterEach
    public void clearData() {
        userRepository.deleteAll();
    }

    @Test
    public void success_get_user_id_1() {
        // Arrange
        MyUser somkiat = new MyUser();
        somkiat.setName("somkiat");
        somkiat.setAge(30);
        userRepository.save(somkiat);
        // Act
        UserResponse response
                = restTemplate.getForObject("/user/1", UserResponse.class);
        // Assert
        assertEquals(1, response.getId());
        assertEquals("somkiat", response.getName());
        assertEquals(30, response.getAge());
        // Quiz
        UserResponse expected = new UserResponse(1, "somkiat", 30);
        assertEquals(expected, response);
    }

    @Test
    public void user_not_found_with_user_id_15() {
        // Act
        ErrorResponse response
                = restTemplate.getForObject("/user/15", ErrorResponse.class);
        // Assert
        assertEquals(1234, response.getCode());
        assertEquals("User not found id=15", response.getMessage());
    }

}