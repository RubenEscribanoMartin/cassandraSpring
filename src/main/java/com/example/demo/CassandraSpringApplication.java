package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraSpringApplication.class, args);
		
		System.out.println("hola");
	}

}
