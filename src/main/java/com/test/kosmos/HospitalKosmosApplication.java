package com.test.kosmos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class HospitalKosmosApplication {

	private static final Logger loggerHandler = LoggerFactory.getLogger(HospitalKosmosApplication.class);



	public static void main(String[] args) {
		SpringApplication.run(HospitalKosmosApplication.class, args);
	}

	@Bean
	public DataSource dataSource() {

		loggerHandler.info("Setting the data source (database) data");

		return DataSourceBuilder.create()
				.driverClassName("org.postgresql.Driver")
				.url("jdbc:postgresql://localhost:5432/kosmos-hospital")
				.username("postgres")
				.password("1234")
				.build();
	}
}
