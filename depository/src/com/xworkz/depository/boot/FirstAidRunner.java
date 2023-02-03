package com.xworkz.depository.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.depository.configuration.FirstAidConfiguration;
import com.xworkz.depository.dto.FirstAidDTO;
import com.xworkz.depository.services.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {
		ApplicationContext configuration = new AnnotationConfigApplicationContext(FirstAidConfiguration.class);
		FirstAidService service = configuration.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println(saved);
	}

}
