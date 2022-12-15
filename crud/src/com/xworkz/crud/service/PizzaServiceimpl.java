package com.xworkz.crud.service;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.PizzaSize;
import com.xworkz.crud.dto.PizzaDTO;
import com.xworkz.crud.repository.PizzaService;

public class PizzaServiceimpl implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO pizzaDto) {
		String name = pizzaDto.getName();
		String company = pizzaDto.getCompany();
		String flavour = pizzaDto.getFlavour();
		String type = pizzaDto.getType();
		PizzaSize size = pizzaDto.getSize();
		System.out.println("The size of the pizza is :-"+size);
		double price = pizzaDto.getPrice();
		/*String createdby=pizzaDto.getCreatedBy();
		LocalDateTime createdDate =pizzaDto.getCreatedDate();
		String updated = pizzaDto.getUpdatedBy();
		String updatedDate=pizzaDto.getUpdatedDate();*/
		boolean validName = false,validcompany = false,validflavour = false,validtype = false,validprice=false;
		
		if (name != null && name.length()>=4 && name.length() <= 20) {
			System.out.println("Valid Pizza Name :- " + name);
			validName=true;
		} else {
			System.out.println("Pizza name is not valid :- " + name);
		}
		
		if (company != null && company.length()>= 4 && company.length() <= 20) {
			System.out.println("The Company name is valid :- " + company);
			validcompany=true;
		} else {
			System.out.println("The Company name is not valid :- " + company);
		}
		
		String spicy = "FullSpicy";
		String notspicy = "No Spicy";
		if (flavour != null && flavour == spicy || flavour == notspicy) {
			System.out.println("The Pizza is hot :-"+flavour);
			validflavour=true;
		} else {
			System.out.println("The Pizza is not Spicy :-"+flavour);
		}
		
		//String Veg = "Veg Pizza";
		//String NonVeg = "Non Veg Pizza";
		if (type != null && type == "Veg" || type == "NonVeg") {
			System.out.println("The Pizza is veg loaded pizza :-"+type);
			validtype=true;
		} else {
			System.out.println("The Pizza is non veg loaded pizza :-"+type);
		}
		
		if(price>=50 && price<=2000) {
			System.out.println("The Pizza price is valid:-"+price);
			validprice=true;
		}else {
			System.out.println("The Pizza price is not valid:-"+price);
		}
		if(validName && validcompany && validflavour && validtype && validprice) {
			System.out.println("Pizza DTO is valid " +pizzaDto);
		}
		System.out.println("Pizza is not valid"+pizzaDto);
		System.out.println(pizzaDto.toString());
		return true;

	}

}
