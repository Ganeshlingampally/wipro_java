package com.controllerfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@EnableJpaRepositories("com.repository")
@EntityScan("com.beanfiles")

public class Employeentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Employeentry.class, args);

	}

}

// POST   http://localhost:8080/employee/user
// PUT    http://localhost:8080/employee/user/1
// GET    http://localhost:8080/employee/user

// Get Employee by ID
//Method: GET
//URL: http://localhost:8080/employee/user/1

//DEL http://localhost:8080/employee/user/1








