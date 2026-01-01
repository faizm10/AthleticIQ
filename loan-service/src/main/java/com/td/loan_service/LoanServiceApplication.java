package com.td.loan_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LoanServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LoanServiceApplication.class);
		app.setWebApplicationType(org.springframework.boot.WebApplicationType.SERVLET);
		app.run(args);
	}

}
