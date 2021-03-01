package com.example.kbtg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.out;

@SpringBootApplication
public class KbtgApplication {

	public static void main(String[] args) {
		// IoC Container, Bean  => Spring
		// DI (Dependency Injection)
		// IoC (Inversion of Control)
		ConfigurableApplicationContext context
				= SpringApplication.run(KbtgApplication.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			out.println(bean);
		}
		out.println(context.getBeanDefinitionCount());
	}

}
