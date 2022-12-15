package com.xworkz.crud.service;

import com.xworkz.crud.constant.ColurName;
import com.xworkz.crud.constant.Type;
import com.xworkz.crud.dto.HelmetDTO;
import com.xworkz.crud.repository.HelmetRepository;

public class HelmetSeriviceImpl implements HelmetSerivice {
	private HelmetRepository helmetRepository;

	public HelmetSeriviceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean saveAndValidation(HelmetDTO helmetDTO) {
		String name = helmetDTO.getName();
		ColurName colur = helmetDTO.getColur();
		Double price = helmetDTO.getPrice();
		Type type = helmetDTO.getType();
		boolean validName = false;
		boolean validcolur = false;
		boolean validprice = false;
		boolean validtype = false;
		if (name != null && name.length()>=4 && name.length()<=20) {
			System.out.println("Helemet name is Valid:-" + name);
			validName = true;
		} else {
			System.err.println("Helemet name is not Valid:-" + name);
		}
		if (price != null && price >= 100 && price <= 2000) {
			System.out.println("Helemet price is Valid:-" + price);
			validprice = true;
		} else {
			System.err.println("Helemet price is not Valid:-" + price);
		}
		if (colur != null) {
			System.out.println("Helemet colur is Valid:-" + colur);
			validcolur = true;
		} else {
			System.err.println("Helemet colur is not Valid:-" + colur);
		}

		if (type != null) {
			System.out.println("Helemet type is Valid:-" + type);
			validtype = true;
		} else {
			System.err.println("Helemet type is not Valid:-" + type);
		}
		if (validName && validcolur && validtype && validprice) {
			System.out.println("Helmet Service is valid, cane save using repository:-" + helmetDTO);
			boolean saved = this.helmetRepository.save(helmetDTO);
			System.out.println("Helmet DTO is saved" + saved);
			return saved;
		}
		return false;
	}

}
