package com.eventosapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.eventosapp.controllers"})
@ComponentScan(basePackages={"com.eventosapp.models"})
public class EventosappApplication {

	public static void main(String[] args) {

		SpringApplication.run(EventosappApplication.class, args);
	}
}
