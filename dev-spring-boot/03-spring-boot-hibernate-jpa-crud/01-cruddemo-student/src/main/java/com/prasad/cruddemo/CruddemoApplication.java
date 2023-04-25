package com.prasad.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean   //This snippet of code will execute after the Spring beans are created
	public CommandLineRunner commandLineRunner(String[] args){ //CommandLineRunner is from the Spring Boot Framework
		//lambda expression
		return runner->{
			System.out.println("Hello World!");
		};
	}

}
