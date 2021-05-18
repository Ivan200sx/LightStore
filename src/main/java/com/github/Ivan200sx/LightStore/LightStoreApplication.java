package com.github.Ivan200sx.LightStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LightStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LightStoreApplication.class, args);
	}

}
