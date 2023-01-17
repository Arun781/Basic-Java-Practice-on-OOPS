package com.xworkz.crocoFestival.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.crocoFestival")
public class BrowserProviderConfiguration {
	public BrowserProviderConfiguration() {
		System.out.println("Created the no ar Const in BrowserProviderConfiguration");
	}
}
