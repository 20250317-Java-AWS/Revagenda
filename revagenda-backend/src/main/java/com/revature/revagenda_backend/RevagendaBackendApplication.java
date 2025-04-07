package com.revature.revagenda_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.revature.revagenda_backend.controllers",
		"com.revature.revagenda_backend.services",
		"com.revature.revagenda_backend.repositories"})
public class RevagendaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevagendaBackendApplication.class, args);
	}

}
