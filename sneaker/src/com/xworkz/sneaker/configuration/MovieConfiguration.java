package com.xworkz.sneaker.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages = "com.xworkz.sneaker", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Collection.class) })
public class MovieConfiguration {
	public MovieConfiguration() {
		System.out.println("Created the MovieConfiguration using no arg const....");
	}

}
