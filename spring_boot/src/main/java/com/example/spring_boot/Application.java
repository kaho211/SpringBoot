package com.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.entity.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// (scanBasePackages = { "com.example.spring_boot.controller.UserController" })
// @EntityScan("com.example.spring_boot.entity.User")
@EnableJpaRepositories("com.example.spring_boot.repository.UserRepository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
