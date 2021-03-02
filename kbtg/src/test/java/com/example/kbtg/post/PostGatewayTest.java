package com.example.kbtg.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class PostGatewayTest {

    @Autowired
    private PostGateway postGateway;

    @Test
    public void success_with_id_1() {

    }

    @Test
    public void should_return_empty_when_exception_is_occured() {

    }

}