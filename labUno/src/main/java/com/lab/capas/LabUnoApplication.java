package com.lab.capas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.lab.capas.proxy.Iemployee;

@SpringBootApplication

@EnableJpaRepositories("com.lab.capas")
public class LabUnoApplication {
	
	static Iemployee service;
	
	public static void main(String[] args) {
		SpringApplication.run(LabUnoApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData(InitDataLoader loader) {
		return args->service.loadData(loader);
	}


}
