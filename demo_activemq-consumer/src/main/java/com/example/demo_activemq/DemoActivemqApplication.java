package com.example.demo_activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class DemoActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoActivemqApplication.class, args);
	}

}
