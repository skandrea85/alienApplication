package com.example.alien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class AlienApplication {
	
	


	public static void main(String[] args) {
		SpringApplication.run(AlienApplication.class, args);
	}
	
	
	@Bean
    @Scope(value = "prototype")
	public Planet planet(String planet) {
		System.out.println("Loading planet "+planet);
		
		switch (planet) {
		case "mars": return new Mars();
		case "venus": return new Venus();
		default: return new Mars();
		}
		
		
		
	}
	
	

}
