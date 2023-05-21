package com.example.myjavaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "model")
@EnableJpaRepositories("repository")
public class MyjavaprojectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyjavaprojectApplication.class, args);
	}

}