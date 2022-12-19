package com.xworkz.crud.service;

import com.xworkz.crud.dto.RailWayStationDTO;
import com.xworkz.crud.exception.InvalidRailWayStationException;
import com.xworkz.crud.repository.RailWayStationRepository;

public class RailWayStationServiceImpl implements RailWayStationService {
	private RailWayStationRepository railWayStationRepository;

	public RailWayStationServiceImpl(RailWayStationRepository railWayStationRepository) {
		this.railWayStationRepository = railWayStationRepository;
	}

	@Override
	public boolean validationRailWayStation(RailWayStationDTO railWayStation) throws InvalidRailWayStationException {
		System.out.println("Running the validationRailWayStation:-" + railWayStation);
		System.err.println("________________________________________________________________________________");
		String name = railWayStation.getName();
		String area = railWayStation.getArea();
		Double noOfPlatForms = railWayStation.getNoOfPlatForms();
		double platFormTicketPrice = railWayStation.getPlatFormTicketPrice();

		boolean bedriddenName = false;
		boolean bedriddenNoOfPlatForms = false;
		boolean bedriddenArea = false;
		boolean bedriddenPlatFormTicketPrice = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("The Name of RailWayDTO is valid:-" + name);
			bedriddenName = true;
		} else {
			System.out.println("The Name of RailWayDTO is not valid:-" + name);
		}
		if (area != null && area.length() >= 3 && area.length() <= 20) {
			System.out.println("The area of RailWayDTO is valid:-" + area);
			bedriddenArea = true;
		} else {
			System.out.println("The area of RailWayDTO is not valid:-" + area);
		}
		if (noOfPlatForms >= 5 && noOfPlatForms <= 20) {
			System.out.println("The noOfPlatForms of RailWayDTO is valid:-" + noOfPlatForms);
			bedriddenNoOfPlatForms = true;
		} else {
			System.out.println("The noOfPlatForms of RailWayDTO is not valid:-" + noOfPlatForms);
		}
		if (platFormTicketPrice >= 5 && platFormTicketPrice <= 20) {
			System.out.println("The platFormTicketPrice of RailWayDTO is valid:-" + platFormTicketPrice);
			bedriddenPlatFormTicketPrice = true;
		} else {
			System.out.println("The platFormTicketPrice of RailWayDTO is not valid:-" + platFormTicketPrice);
		}
		System.err.println("________________________________________________________________________________");

		if (bedriddenName && bedriddenNoOfPlatForms && bedriddenArea && bedriddenPlatFormTicketPrice) {
			System.out.println("The RailWayStationDTO varified and you can save to RailWay repo:-" + railWayStation);
			System.err.println("________________________________________________________________________________");
			boolean saves = railWayStationRepository.save(railWayStation);
			System.out.println(" The RailWayStationDTO is Varified and saved to RailWayStationRepository :-" + saves);
			System.err.println("________________________________________________________________________________");
			return saves;
		}
		throw new InvalidRailWayStationException("Check the you have initialised");

	}

}
