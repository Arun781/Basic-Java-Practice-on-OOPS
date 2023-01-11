package com.xworkz.springs.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.springs.bean.HardwareShop;
import com.xworkz.springs.bean.Pencil;
import com.xworkz.springs.bean.PersonInfo;
import com.xworkz.springs.bean.Rubber;
import com.xworkz.springs.bean.Software;
import com.xworkz.springs.bean.SoftwareEngineer;
import com.xworkz.springs.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		//ApplicationContext:-used to create enterprise application
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] ref = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		System.out.println("=================================");
//		String hardwareShop = applicationContext.getBean("name", String.class);
		HardwareShop hardwareShop2=applicationContext.getBean(HardwareShop.class);
		System.out.println(hardwareShop2.toString());
		System.out.println("=================================");
		Software Software = applicationContext.getBean(Software.class);
		System.out.println(Software.toString());
		System.out.println("=================================");
		SoftwareEngineer softwareEngineer = applicationContext.getBean(SoftwareEngineer.class);
		System.out.println(softwareEngineer.toString());
		System.out.println("=================================");
		Pencil pencil = applicationContext.getBean(Pencil.class);
		System.out.println(pencil.toString());
		System.out.println("=================================");
		Rubber rubber = applicationContext.getBean(Rubber.class);
		System.out.println(rubber.toString());
		System.out.println("=================================");
		PersonInfo info = applicationContext.getBean(PersonInfo.class);
		System.out.println(info.toString());
	}

}
