package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.PizzaSize;
import com.xworkz.crud.dto.PizzaDTO;
import com.xworkz.crud.service.PizzaServiceimpl;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDTO pizzaDTO = new PizzaDTO();
		pizzaDTO.setName("Detroit Pizza");
		System.out.println("_____________________________________________________");
		pizzaDTO.setCompany("Domino's Pizza");
		pizzaDTO.setFlavour("FullSpicy");
		pizzaDTO.setType("Veg");
		pizzaDTO.setPrice(250);
		pizzaDTO.setCheese(true);
		pizzaDTO.setSize(PizzaSize.MEDIUM);
		pizzaDTO.setCreatedBy("Arun Veerapur");
		pizzaDTO.setCreatedDate(LocalDateTime.now());
		pizzaDTO.setUpdatedBy("Arun.B.V");
		pizzaDTO.setUpdatedDate(LocalDateTime.now());

		PizzaServiceimpl pizzaService = new PizzaServiceimpl();
		boolean saved = pizzaService.validateAndSave(pizzaDTO);
		System.out.println(saved);
		
	}

}
