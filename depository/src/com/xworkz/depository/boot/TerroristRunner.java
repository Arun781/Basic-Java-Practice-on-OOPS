package com.xworkz.depository.boot;

import com.xworkz.depository.dto.TerroristDTO;
import com.xworkz.depository.services.TerroristService;
import com.xworkz.depository.services.TerroristServiceImpl;

public class TerroristRunner {

	public static void main(String[] args) {
		TerroristDTO terroristDTO = new TerroristDTO();
		terroristDTO.setName("Neeraj");
		terroristDTO.setAge(23);
		terroristDTO.setCountry("Pakistan");
		terroristDTO.setOrganization("ISI");
		System.out.println(terroristDTO);

		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(terroristDTO);
		

	}

}
