package com.cashcard;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class CashcardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashcardsApplication.class, args);
	}

}
