package com.xworkz.crud.repository;

import com.xworkz.crud.dto.PizzaDTO;

public interface PizzaService {
	boolean validateAndSave(PizzaDTO pizzaDto);
}
