package com.export;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ExportWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExportWebServiceApplication.class, args);
	}

}

