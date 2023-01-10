package com.xworkz.maven.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.maven.bean.Actor;
import com.xworkz.maven.bean.Rocket;
import com.xworkz.maven.bean.Season;

@Configuration
@ComponentScan("com.xworkz.maven")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created the SpringConfiguration");
	}
	@Bean
	public Rocket rocketspace() {
		System.out.println("Registering the space rocket using Spring");
		Rocket rocket = new Rocket();
		return rocket;
	}
	@Bean
	public Actor action() {
		System.out.println("Registering the space actor using Spring");
		Actor actor= new Actor("Prabhas","Telugu",40);
		return actor;
	}
	@Bean
	public Season seasons() {
		System.out.println("\"Registering the Season using Spring");
		Season sea= new Season();
		sea.setDurationOfSeason(200d);
		sea.setName("Spring");
		sea.setStartingMonth("Feb - March");
		return sea;
	}
	
}
