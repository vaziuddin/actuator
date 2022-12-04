package com.humachine.actuator;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ActuatorApplication {

	public static void main(String[] args) {
//		SpringApplication springAppication = new SpringApplication(ActuatorApplication.class);
		SpringApplication.run(ActuatorApplication.class, args);
	}

}
