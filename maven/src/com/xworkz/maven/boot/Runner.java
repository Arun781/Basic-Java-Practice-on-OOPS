package com.xworkz.maven.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.maven.bean.Actor;
import com.xworkz.maven.bean.Rocket;
import com.xworkz.maven.bean.Season;
import com.xworkz.maven.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String [] bean = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		System.out.println("============================================================");
		
		Rocket refOfRocket= container.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getPrice());
		System.out.println("----------------------------------------------------------");
		
		Rocket refOfRocket1= container.getBean("rocketspace",Rocket.class);
		System.out.println(refOfRocket1);
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getPrice());
		System.out.println("____________________________________________________________");
		Actor refOfActor= container.getBean("actor",Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLang());
		System.out.println(refOfActor.getAge());
		System.out.println("----------------------------------------------------------");
		
		Actor refOfActor1= container.getBean("action",Actor.class);
		System.out.println(refOfActor1);
		System.out.println(refOfActor1.getName());
		System.out.println(refOfActor1.getLang());
		System.out.println(refOfActor1.getAge());
		System.out.println("____________________________________________________________");
		
		Season refOfSeason = container.getBean("seasons",Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartingMonth());
		System.out.println(refOfSeason.getDurationOfSeason());
		System.out.println("----------------------------------------------------------");
		
		Season refOfSeason1 = container.getBean("seasons",Season.class);
		System.out.println(refOfSeason1);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getStartingMonth());
		System.out.println(refOfSeason1.getDurationOfSeason());
		System.out.println("________________________________________________________________");
		
	}

}
