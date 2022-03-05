package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
public class Dec24jeeApplication   extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Dec24jeeApplication.class);
	}


	public static void main(String[] args) {
		String c="john";
		System.out.println("in java program");
		System.out.println(c);
		SpringApplication.run(Dec24jeeApplication.class, args);
		
	}

}
