package com.test.kosmos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalKosmosApplication {

	private static final Logger loggerHandler = LoggerFactory.getLogger(HospitalKosmosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HospitalKosmosApplication.class, args);
	}

}
