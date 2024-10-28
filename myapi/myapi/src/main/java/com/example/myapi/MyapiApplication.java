package com.example.myapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyapiApplication {

	public static void main(String[] args) {
		// Print a message when the application starts
		System.out.println("Starting My API Application...");
		SpringApplication.run(MyapiApplication.class, args);
	}
}
