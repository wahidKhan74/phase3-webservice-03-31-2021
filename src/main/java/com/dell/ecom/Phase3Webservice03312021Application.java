package com.dell.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sprig Boot :  Java-based Spring configuration, component scanning are auto configured.
 * @SpringBootApplication  : this annotation allow spring auto configuration.
 * @SpringBootApplication  = @Configuration + @ComponentScan  + @EnableAutoConfiguration
 * @Configuration : -> enable Java-based configuration
 * @ComponentScan :-> enable component scanning.
 * @EnableAutoConfiguration  :-> Spring Boot's auto-configuration feature.
 */
@SpringBootApplication
public class Phase3Webservice03312021Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3Webservice03312021Application.class, args);
	}

}
