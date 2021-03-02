package com.example.kbtg.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void found_get_user_by_id() {
        // Arrange
        MyUser somkiat = new MyUser();
        somkiat.setName("somkiat");
        somkiat.setAge(30);
        userRepository.save(somkiat);
        // Act
        Optional<MyUser> user = userRepository.findById(1);
        // Assert
        assertTrue(user.isPresent());

        MyUser expected = new MyUser(1, "somkiat", 30);
        assertEquals(expected, user.get());
    }

    @Test
    public void not_found_get_user_by_id() {
        // Act
        Optional<MyUser> user = userRepository.findById(1);
        // Assert
        assertFalse(user.isPresent());
    }

}