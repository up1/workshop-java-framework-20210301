package com.example.demo_activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/hello/{name}")
    public String sendData(@PathVariable String name) {
        jmsTemplate.convertAndSend("helloQueue", name);
        return "OK...i'm got your name = " + name;
    }

}
