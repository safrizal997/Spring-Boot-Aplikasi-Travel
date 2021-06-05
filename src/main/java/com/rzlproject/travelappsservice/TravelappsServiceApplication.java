package com.rzlproject.travelappsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TravelappsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelappsServiceApplication.class, args);
	}

}
