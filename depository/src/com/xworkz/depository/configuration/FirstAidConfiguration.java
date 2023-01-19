package com.xworkz.depository.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.depository")
public class FirstAidConfiguration {
	public FirstAidConfiguration() {
		System.out.println("Created the FirstAidConfiguration using no arg const....");
	}
	@Bean
	public Validator validator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valide = factory.getValidator();
		return valide;
	}
}
