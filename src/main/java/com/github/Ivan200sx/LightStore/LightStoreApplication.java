package com.github.Ivan200sx.LightStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import com.github.Ivan200sx.LightStore.ui.MainView;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LightStoreApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LightStoreApplication.class, args);
	}

}
