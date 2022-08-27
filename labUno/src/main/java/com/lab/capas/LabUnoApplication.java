package com.lab.capas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories("com.lab.uno.labUno")
public class LabUnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabUnoApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData(InitDataLoader loader) {
		return args->loader.loadData();
	}


}
