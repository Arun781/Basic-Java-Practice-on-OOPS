package com.xworkz.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.demo.bean.Demo;

@Configuration
@ComponentScan("com.xworkz.demo")
public class DemoConfiguration {
	public DemoConfiguration() {
		System.out.println("Creating configuration");
	}
	
	@Bean 
	
	public Demo getdemo()
	{
		Demo demo=new Demo();
		demo.setContactNo(12566L);
		demo.setName("Arun");
		demo.setColor("blue");
		return demo;
	}

}
