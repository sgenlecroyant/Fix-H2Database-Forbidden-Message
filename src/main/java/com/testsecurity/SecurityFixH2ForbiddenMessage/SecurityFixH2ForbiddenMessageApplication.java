package com.testsecurity.SecurityFixH2ForbiddenMessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.JavaVersion;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class SecurityFixH2ForbiddenMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityFixH2ForbiddenMessageApplication.class, args);
		
		System.out.println("Spring Version: "+SpringVersion.getVersion());
		System.out.println("Spring Boot Version: " +SpringBootVersion.getVersion());
		System.out.println("Java Version: "+JavaVersion.getJavaVersion());
	}

}
