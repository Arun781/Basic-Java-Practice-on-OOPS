package com.xworkz.sneaker.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.sneaker.bean.Movie;
import com.xworkz.sneaker.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {
		

			ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
			System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

			Movie refOfMovie = container.getBean(Movie.class);
			
		
	}

}
