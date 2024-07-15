package com.example.sampleprojectwithdb;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.example.sampleprojectwithdb.dao"})
//@EntityScan("com.example.sampleprojectwithdb.model")
public class SampleprojectwithdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleprojectwithdbApplication.class, args);
	}

}
