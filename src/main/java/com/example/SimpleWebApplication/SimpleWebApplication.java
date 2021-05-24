package com.example.SimpleWebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.SimpleWebApplication.*"})
public class SimpleWebApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}

}
