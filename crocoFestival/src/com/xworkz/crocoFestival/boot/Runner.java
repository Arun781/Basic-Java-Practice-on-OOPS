package com.xworkz.crocoFestival.boot;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.crocoFestival.configuration.CrocoConfiguration;
import com.xworkz.crocoFestival.thing.PetrolBunk;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(CrocoConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		PetrolBunk petrolBunk = container.getBean(PetrolBunk.class);

		petrolBunk.purchase();
	}

}
