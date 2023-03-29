package com.prasad.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // basically says we have spring boot application.
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	//SpringApplication.run - Boostrap the spring boot application,
	// we basically give we say SpringApplication.run and
	// then give our actual class name that we wish to run

}
