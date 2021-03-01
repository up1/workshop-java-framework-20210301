package com.example.demo_activemq;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {

    @JmsListener(destination = "helloQueue")
    public void processMessage(String name) {
        System.out.println("Received Message from queue = " + name);
    }

}
