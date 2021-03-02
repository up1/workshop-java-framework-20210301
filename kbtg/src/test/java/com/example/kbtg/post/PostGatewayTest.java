package com.example.kbtg.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class PostGatewayTest {

    @Autowired
    private PostGateway postGateway;

    @Test
    public void success_with_id_1() {
        Optional<PostResponse> result = postGateway.getPostById(1);
        assertTrue(result.isPresent());
        PostResponse postResponse = result.get();
        assertEquals(1, postResponse.getId());
        assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", postResponse.getTitle());
    }

    @Test
    public void should_return_empty_when_exception_is_occured() {
        // TODO
    }

}