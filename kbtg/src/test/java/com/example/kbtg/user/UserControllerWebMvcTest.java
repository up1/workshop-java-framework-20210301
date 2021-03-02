package com.example.kbtg.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
public class UserControllerWebMvcTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void failure_user_not_found() throws Exception {
        MvcResult mvcResult = mvc.perform(get("/user/15")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
    }

}