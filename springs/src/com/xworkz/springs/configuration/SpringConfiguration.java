package com.xworkz.springs.configuration;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springs")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Regestering the SpringConfiguration");
	}

	@Bean("id")
	public String idName() {
		String ref = new String("ABC123");
		return ref;
	}

	@Bean("name")
	public String name() {
		String ref = new String("Shree Sadguru Hardware");
		return ref;
	}

	@Bean("gst")
	public String gstNo() {
		String ref = new String("GSTIN2255002255");
		return ref;
	}

	@Bean("owner")
	public String ownerName() {
		String ref = new String("Tataji");
		return ref;
	}

	@Bean("address")
	public String address() {
		String ref = new String("Huvina Hadagali");
		return ref;
	}

	@Bean("Softwarename")
	public String Softwarename() {
		return "Maven";
	}

	@Bean("version")
	public Double version() {
		return 3.5d;
	}

	@Bean("SoftwareDevelopedBy")
	public String SoftwareDevelopedBy() {
		return "Shashi";
	}

	@Bean("date")
	public LocalDateTime date() {
		return LocalDateTime.now();
	}
	@Bean("free")
	public boolean free() {
		return true;
	}
	
	@Bean("SoftwareEngineerName")
	public String SoftwareEngineerName() {
		return"Omkar";
	}
	@Bean("companyName")
	public String companyName() {
		return "X-Workz";
	}
	@Bean("salary")
	public double salary() {
		return 5000000d;
	}
	@Bean("experience")
	public double experience() {
		return 10D;
	}
	
	@Bean("PencilName")
	public String PencilName() {
		return"Natraj";
	}
	
	@Bean("PencilType")
	public String PencilType() {
		return "use and throw";
	}
	
	@Bean("price")
	public int price() {
		return 50;
	}
	
	@Bean("pencilColur")
	public String pencilColur() {
		return "black";
	}
	
	@Bean("sharp")
	public boolean sharp() {
		return true;
	}
	
	@Bean("PencilStolen")
	public boolean PencilStolen() {
		return true;
	}
	
	@Bean("rubberName")
	public String rubberName() {
		return "Doms";
	}
	
	@Bean("rubberType")
	public String rubberType() {
		return "ones use";
	}
	
	@Bean("rubberColur")
	public String rubberColur() {
		return "White";
	}
	
	@Bean("rubberShape")
	public String rubberShape() {
		return "Round";
	}
	
	@Bean("rubberPrice")
	public int rubberPrice() {
		return 5;
	}
	
	@Bean("rubberSize")
	public float rubberSize() {
		return 5.5f;
	}
	
	@Bean("RubberStolen")
	public boolean RubberStolen() {
		return true;
	}
	
	
	@Bean("personName")
	public String personName(){
		return "Sunil";
	}
	
	@Bean("personage")
	public int personage() {
		return 30;
	}
	
	@Bean("personheight")
	public short personheight() {
		return 5;
	}
	
	@Bean("personcellNum")
	public long personcellNum() {
		return 9620753670l;
	}
	
	@Bean("personweight")
	public float personweight() {
		return 50.5f;
	}
	
	@Bean("personsalary")
	public double personsalary() {
		return 25000D;
	}
	
	@Bean("personalive")
	public boolean personalive() {
		return true;
	}
	
	@Bean("persongender")
	public char persongender() {
		return 'M';
	}
	
	@Bean("personbirthDate")
	public byte personbirthDate() {
		return 35;
	}
}
