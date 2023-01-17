package com.xworkz.crocoFestival.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.crocoFestival")
public class CrocoConfiguration {
	public CrocoConfiguration() {
		System.out.println("Created the no arg CrocoConfiguration const.....");
	}
}
