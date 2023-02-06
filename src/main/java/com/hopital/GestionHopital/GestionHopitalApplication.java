package com.hopital.GestionHopital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GestionHopitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHopitalApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "hello Word!";
	}
}
