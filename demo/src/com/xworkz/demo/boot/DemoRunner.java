package com.xworkz.demo.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.demo.bean.Demo;
import com.xworkz.demo.configuration.DemoConfiguration;

public class DemoRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(DemoConfiguration.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Demo demo = container.getBean(Demo.class);
		System.out.println(demo.hashCode());//hash code
		System.out.println(demo.getName());//aishwarya
		
		Demo demo1 = container.getBean("getdemo",Demo.class);
		System.out.println(demo1.hashCode());//hash code
		System.out.println(demo1.getName());//aishwarya
		


	}

}
