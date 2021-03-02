package com.example.kbtg.post;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
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
    @DisplayName("ทำการใช้ id ที่ไม่มีในระบบ ซึ่งต้องจัดการ data ในระบบก่อน เช่น id=200")
    public void fail_01() {
        Optional<PostResponse> result = postGateway.getPostById(200);
        assertFalse(result.isPresent());
    }

}