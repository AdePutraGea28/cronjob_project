package com.cronjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CronjobProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronjobProjectApplication.class, args);
	}

}
