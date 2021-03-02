package com.example.kbtg.post;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class PostGateway2Test {

    @Autowired
    private PostGateway postGateway;

    @MockBean RestTemplate restTemplate;

    @Test
    @DisplayName("ทำการ mock ค่าที่ return จาก rest template ")
    public void fail_02() {
        // Arrange
        when(restTemplate.getForObject(anyString(), eq(PostResponse.class)))
                .thenThrow(new RestClientException(""));
        // Act
        Optional<PostResponse> result = postGateway.getPostById(1);
        // Assert
        assertFalse(result.isPresent());
    }

}