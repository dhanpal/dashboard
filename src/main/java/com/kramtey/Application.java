package com.kramtey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.kramtey"})
//@AutoConfigurationPackage
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
