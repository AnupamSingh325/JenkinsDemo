package com.example.JenkinsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
		System.out.println("Basic Spring Boot Project for Jenkins upload");
	}

}
