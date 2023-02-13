package com.hopital.GestionHopital;

import com.hopital.GestionHopital.Entity.Patient;
import com.hopital.GestionHopital.Repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class GestionHopitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHopitalApplication.class, args);
	}

	@Bean
	CommandLineRunner run(PatientRepository patientRepository) {
		return  args -> {
			patientRepository.save(new Patient(5l,"madou","hamdallaye",83773663, LocalDate.of(2022, Month.JANUARY,03),"madel@gmail.com","homme","crazy by programming"));
			patientRepository.save(new Patient(6l,"lassi","hamdallaye",83773663, LocalDate.of(2023, Month.JANUARY,03),"lassiBa@gmail.com","homme","crazy by programming"));
			patientRepository.save(new Patient(7l,"seyan","hamdallaye",83773663, LocalDate.of(2021, Month.JANUARY,03),"seyan@gmail.com","homme","crazy by programming"));
			patientRepository.save(new Patient(8l,"ibrahim","hamdallaye",83773663, LocalDate.of(2023, Month.JANUARY,03),"ibrim@gmail.com","homme","crazy by programming"));
			patientRepository.save(new Patient(9l,"abdoul","hamdallaye",83773663, LocalDate.of(2019, Month.JANUARY,03),"doul@gmail.com","homme","crazy by programming"));

		};
	}
}
