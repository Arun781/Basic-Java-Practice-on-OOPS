package com.xworkz.crud.runner;

import com.xworkz.crud.constant.ColurName;
import com.xworkz.crud.constant.Type;
import com.xworkz.crud.dto.HelmetDTO;
import com.xworkz.crud.repository.HelmetRepository;
import com.xworkz.crud.repository.HelmetRepositoryImpl;
import com.xworkz.crud.service.HelmetSerivice;
import com.xworkz.crud.service.HelmetSeriviceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO helmetDTO = new HelmetDTO("Vegga",ColurName.Black, 2000D, Type.Full_Helmet, null, null, null, null);
		HelmetRepository repository= new HelmetRepositoryImpl();
		HelmetSerivice HelmetSeriviceImpl = new HelmetSeriviceImpl(repository);
		boolean success= HelmetSeriviceImpl.saveAndValidation(helmetDTO);
		System.out.println("Success:-"+success);
	}

}
