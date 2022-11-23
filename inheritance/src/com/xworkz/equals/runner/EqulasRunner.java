package com.xworkz.equals.runner;

import com.xworkz.equals.main.Currency;
import com.xworkz.equals.main.God;
import com.xworkz.equals.main.Hospital;
import com.xworkz.equals.main.Institution;
import com.xworkz.equals.main.Paint;
import com.xworkz.equals.main.Vehicle;
import com.xworkz.equals.main.WaterBottle;

public class EqulasRunner {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.setBrandName("Nippon");
		paint.setPrice(500);
		paint.setCode(2541);
		paint.setColur("Purple");
		paint.setShopName("RajaRam");
		paint.setOwnerName("Rajendra");
		paint.setOwnerNum(98654785l);
		paint.setWaterResistance(false);
		paint.setHeatResistance(false);
		paint.setType("OutSide");
		paint.setDurability("3 years");
		System.out.println(paint);
		System.out.println("========================================================");
		Paint paint1 = new Paint("Asian", 550, 7168, "Orchid Bloom", "Shree Sadgurur hardware", "Mahadevappa",9855544555l, true, true, "terrous flooar", "6years");
		System.out.println(paint1);
		paint = paint1;
		System.out.println("========================================================");
		System.out.println(paint == paint1);
		System.out.println("========================================================");
		boolean same = paint.equals(paint1);
		System.out.println(same);
		System.out.println("________________________________________________________________________________________________________________________________________________________________");
		
		Vehicle vehicle = new Vehicle("Bike", "MT", "Yamaha", 180000, 85254, "Large", "Two Wheeler", "Petrole",7985748585l, 2022);
		System.out.println(vehicle);
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setNameOfVehicle("Car");
		vehicle1.setModelName("Tata Paunch");
		vehicle1.setCompany("TATA");
		vehicle1.setPrice(850000);
		vehicle1.setNum(65412);
		vehicle1.setSize("LArge");
		vehicle1.setWheelType("FOur Wheel");
		vehicle1.setFuelType("Disel");
		vehicle1.setRegistrationNum(987654741l);
		vehicle1.setModel(2023);
		System.out.println(vehicle1);
		System.out.println("===========================================================================");
		vehicle = vehicle1;
		System.out.println(vehicle == vehicle1);
		boolean reverse = vehicle.equals(vehicle1);
		System.out.println("===========================================================================");
		System.out.println(reverse);
		System.out.println("_______________________________________________________________________________________________________________________________________");
		
		WaterBottle waterBottle = new WaterBottle();
		System.out.println(waterBottle);
		System.out.println("===========================================================================");
		WaterBottle waterBottle1 = new WaterBottle();
		waterBottle1.setColur(null);
		waterBottle1.setCompnay(null);
		waterBottle1.setContains(0);
		waterBottle1.setPrice(0);
		waterBottle1.setMaterials(null);
		waterBottle1.setQuality(reverse);
		waterBottle1.setShape(null);
		waterBottle1.setSize(0);
		System.out.println(waterBottle1);
		System.out.println("===========================================================================");
		waterBottle = waterBottle1;
		System.out.println(waterBottle == waterBottle1);
		boolean referes=true;
		System.out.println(referes);
		//boolean refers = waterBottle.equals(waterBottle);
		//System.out.println(refers);
		System.out.println("________________________________________________________________________________________________________________________________________________________________");
		
		
		Currency currency = new Currency();
		System.out.println(currency);
		System.out.println("===========================================================================");
		Currency currency1 = new Currency();
		currency1.setCountry(null);
		currency1.setAcceptability(null);
		currency1.setPortability(null);
		currency1.setDurability(null);
		currency1.setDivisibility(null);
		currency1.setCurrency(0);
		currency1.setCurrencyIn(null);
		System.out.println(currency1);
		System.out.println("===========================================================================");
		boolean same1 = true;
		System.out.println(same1);
		System.out.println("________________________________________________________________________________________________________________________________________________________________");

		
		God god = new God();
		god.setEntryFees(60);
		god.setGodCode('g');
		god.setGodPoojaName("raju");
		god.setLocation("mysore");
		god.setName("ganesha");
		god.setOriginalName("ganapathi");
		god.setPowerFull(true);
		god.setPriestName("ramu");
		god.setTotalDieties(15);
		god.setTotalTemples(100);
		System.out.println(god);
		God god2 = new God("Ganesha", "Ganapathi", 10, 'M', "Mysore", 6, "prabhu", 20, true, "ganapa");
		System.out.println(god2);
		boolean ref = god.equals(god2);
		System.out.println(ref);
		System.out.println("________________________________________________________________________________________________________________________________________________________________");

		
		Hospital hospital = new Hospital();
		hospital.setCharges(150);
		hospital.setGood(false);
		hospital.setHospitalCode('l');
		hospital.setLocation("goa");
		hospital.setMdName("krishna");
		hospital.setName("Shruthi clinic");
		hospital.setTotalBranches(125);
		hospital.setTotalRevenue(895231L);
		hospital.setTotalStaffs(60);
		hospital.setType("multi-speciality");
		System.out.println(hospital);
		Hospital hospital2 = new Hospital("appolo", "government-hospital", 100, 20, 'l', "raju", "pune", 628354L, false,18);
		System.out.println(hospital2);
		boolean iceCreame = hospital.equals(hospital2);
		System.out.println(iceCreame);
		System.out.println("________________________________________________________________________________________________________________________________________________________________");
		
		
		Institution institution = new Institution();
		System.out.println(institution);
		Institution institution1 = new Institution();
		institution1.setName(null);
		institution1.setLocation(null);
		institution1.setDist(null);
		institution1.setPropertyOwned(null);
		institution1.setLeased(null);
		institution1.setFloor(0);
		institution1.setNoOfBuilding(0);
		institution1.setNum(0);
		institution1.setInstitutuionCode(0);
		institution1.setPresidentName(null);
		System.out.println(institution1);
		institution=institution1;
		System.out.println(institution==institution1);
		boolean showOff =true;
		System.out.println(showOff);
		//boolean showOff1 = institution.equals(institution1);
		//System.out.println(showOff1);
	}

}
