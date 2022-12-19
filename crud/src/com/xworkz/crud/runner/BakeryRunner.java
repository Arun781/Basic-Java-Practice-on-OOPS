package com.xworkz.crud.runner;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.Names;
import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.InvalidBakeryException;
import com.xworkz.crud.repository.BakeryRepository;
import com.xworkz.crud.repository.BakeryRepositoryImpl;
import com.xworkz.crud.service.BakeryService;
import com.xworkz.crud.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {

		BakeryDTO bakeryDTO1 = new BakeryDTO(Names.AlbertBakery, "Albert", "Hyderbad", 3525, "RasMalai", "Albert John",
				LocalDateTime.now(), "Albert Estine", LocalDateTime.MAX);
		BakeryDTO bakeryDTO2 = new BakeryDTO(Names.DeliciousAndFreshBakery, "Albert", "Hyderbad", 105, "RasMalai",
				"Albert John", LocalDateTime.now(), "Albert Estine", LocalDateTime.now());
		BakeryDTO bakeryDTO3 = new BakeryDTO(Names.MakeYourBdayBakery, "Albert", "Hyderbad", 105, "RasMalai",
				"Albert John", LocalDateTime.now(), "Albert Estine", LocalDateTime.now());
		BakeryDTO bakeryDTO4 = new BakeryDTO(Names.WarmOvenBakery, "Albert", "Hyderbad", 105, "RasMalai", "Albert John",
				LocalDateTime.now(), "Albert Estine", LocalDateTime.now());
		BakeryDTO bakeryDTO5 = new BakeryDTO(Names.MakeYourBdayBakery, "Albert", "Hyderbad", 105, "RasMalai",
				"Albert John", LocalDateTime.now(), "Albert Estine", LocalDateTime.now());
		BakeryDTO bakeryDTO6 = new BakeryDTO(Names.AlbertBakery, "Albert", "Hyderbad", 105, "RasMalai", "Albert John",
				LocalDateTime.now(), "Albert Estine", LocalDateTime.now());

		BakeryRepository bakeryRepository = new BakeryRepositoryImpl();
		BakeryService bakeryService = new BakeryServiceImpl(bakeryRepository);
		try {
			bakeryService.validateAndSave(bakeryDTO1);
		} catch (InvalidBakeryException e) {

			e.printStackTrace();
		}
	}

}
