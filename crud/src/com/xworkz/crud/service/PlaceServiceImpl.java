package com.xworkz.crud.service;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.InvalidPlaceException;
import com.xworkz.crud.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {
	private PlaceRepository placeRepository;

	public PlaceServiceImpl(PlaceRepository placeRepository) {
		System.err.println(
				"___________________________________________________________________________________________________________________________");
		System.out.println("Running the PlaceRepositoryImpl parameterised Constructor");
		this.placeRepository = placeRepository;
	}

	@Override
	public boolean validateData(PlaceDTO placeDTO) throws InvalidPlaceException {
		System.err.println(
				"___________________________________________________________________________________________________________________________");
		System.out.println("Validating the Place DTO to save data to place Repo:-" + placeDTO);
		System.err.println("___________________________________________________________________________________________________________________________");
		String nameOfPlace = placeDTO.getNameOfPlace();
		Double arenInSQKM = placeDTO.getArenInSQKM();
		String distName = placeDTO.getDistName();
		String taName = placeDTO.getTaName();
		String stateName = placeDTO.getStateName();

		boolean validNameOfPlace = false;
		boolean validArenInSQKM = false;
		boolean validDistName = false;
		boolean validTaName = false;
		boolean validStateName = false;

		if (nameOfPlace != null && nameOfPlace.length() >= 4 && nameOfPlace.length() <= 20) {
			System.out.println("The nameOfPlace is valid :-" + nameOfPlace);
			validNameOfPlace = true;
		} else {
			System.out.println("The nameOfPlace is not valid :-" + nameOfPlace);
		}
		if (arenInSQKM != null && arenInSQKM >= 1000 && arenInSQKM <= 20000) {
			System.out.println("The arenInSQKM is valid :-" + arenInSQKM);
			validArenInSQKM = true;
		} else {
			System.out.println("The arenInSQKM is not valid :-" + arenInSQKM);
		}
		if (distName != null && distName.length() >= 4 && distName.length() <= 20) {
			System.out.println("The distName is valid :-" + distName);
			validDistName = true;
		} else {
			System.out.println("The distName is not valid :-" + distName);
		}
		if (taName != null && taName.length() >= 4 && taName.length() <= 20) {
			System.out.println("The taName is valid :-" + taName);
			validTaName = true;
		} else {
			System.out.println("The taName is not valid :-" + taName);
		}
		if (stateName != null && stateName.length() >= 4 && stateName.length() <= 20) {
			System.out.println("The stateName is valid :-" + stateName);
			validStateName = true;
		} else {
			System.out.println("The stateName is not valid :-" + stateName);
		}
		if (validNameOfPlace && validArenInSQKM && validDistName && validTaName && validStateName) {
			System.out.println("The PlaceServiceImpl is varified and checked:-" + placeDTO);
			System.err.println(
					"___________________________________________________________________________________________________________________________");
			boolean saved = placeRepository.storingData(placeDTO);
			System.out.println("The PlaceServiceImpl is varified and saved to PlaceRepository:-" + placeDTO);
			System.err.println(
					"___________________________________________________________________________________________________________________________");
			return true;
		}
		throw new InvalidPlaceException("Check the data you have entered:-" + placeDTO);
	}

}
