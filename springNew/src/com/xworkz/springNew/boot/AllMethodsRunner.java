package com.xworkz.springNew.boot;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springNew.bean.Engine;
import com.xworkz.springNew.bean.Ghost;
import com.xworkz.springNew.bean.NewsPaper;
import com.xworkz.springNew.bean.Snake;
import com.xworkz.springNew.configuration.ConfigurationString;

public class AllMethodsRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationString.class);
		String [] bean = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		System.out.println("============================================================");
		NewsPaper newsPaper = applicationContext.getBean(NewsPaper.class);
		System.out.println(newsPaper);
		System.out.println("============================================================");
		Snake snake = applicationContext.getBean(Snake.class);
		System.out.println(snake);
		System.out.println("============================================================");
		Engine engine  = applicationContext.getBean(Engine.class);
		System.out.println(engine);
		System.out.println("============================================================");
		Ghost ghost = applicationContext.getBean(Ghost.class);
		System.out.println(ghost.toString());
		
	}

}
