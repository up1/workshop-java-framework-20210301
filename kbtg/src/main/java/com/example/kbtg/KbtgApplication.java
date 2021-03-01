package com.example.kbtg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.out;

@SpringBootApplication
public class KbtgApplication {

	public static void main(String[] args) {
		// IoC Container => Context, Bean  => Spring
		// IoC (Inversion of Control)
		// DI (Dependency Injection)
		ConfigurableApplicationContext context
				= SpringApplication.run(KbtgApplication.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			out.println(bean);
		}
		out.println(context.getBeanDefinitionCount());

//		// Demo :: Singleton instance
//		User user1 = context.getBean(User.class);
//		user1.setName("Somkiat");
//		out.println(user1.getName()); // 1
//
//		User user2 = context.getBean(User.class);
//		user2.setName("User 2");
//		out.println(user2.getName()); // 2
//		out.println(user1.getName()); // 3

	}

}
