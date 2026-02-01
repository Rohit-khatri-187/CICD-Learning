package com.rohit.cicd.Java_CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCicdApplication.class, args);
		System.out.println("CICD testing server started");
	}

}
