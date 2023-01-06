package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.ApplicationDTO;
import com.xworkz.collections.dto.CompnayCEODTO;
import com.xworkz.collections.dto.DataBaseVendorDTO;
import com.xworkz.collections.dto.DaughterDTO;
import com.xworkz.collections.dto.PalaceDTO;
import com.xworkz.collections.enums.VesrionType;

public class CollectionDTORunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> palace = new LinkedList<PalaceDTO>();
		palace.add(new PalaceDTO("Mysore Palace", "Mysore", "Arun", false, 1000));
		palace.add(new PalaceDTO("Bangaloure Palace", "Bangaloure", "Shashank", true, 500));
		palace.add(new PalaceDTO("Hyderbad Palace", "Hyderbad", "Neeraj", false, 150));
		palace.add(new PalaceDTO("Hospet Palace", "Hospet", "ShreeSham", true, 100));
		palace.add(new PalaceDTO("Ballari Palace", "Ballari", "Gagan", false, 250));
		palace.stream().filter(dto -> dto.getDestroyed()).collect(Collectors.toList())
				.forEach(destroyedBy -> System.out.println(destroyedBy));

		System.out.println(
				"________________________________________________________________________________________________________________");

		Collection<ApplicationDTO> application = new ArrayList<ApplicationDTO>();
		application.add(new ApplicationDTO("Google Play Store", 25.313D, false, "Google", 15000));
		application.add(new ApplicationDTO("G-mail", 29.313D, true, "Google", 25000));
		application.add(new ApplicationDTO("Google Photos", 32.313D, false, "Google", 54212));
		application.add(new ApplicationDTO("Google Drive", 24.313D, true, "Google", 30000));
		application.add(new ApplicationDTO("Google Doc", 22.313D, true, "Google", 32000));

		System.out.println(System.lineSeparator());
		System.out.println("Find All ApplicationDTO which is free and Developed By Google");
		// Find All ApplicationDTO which is free and Developed By Google
		application.stream().filter(ele -> ele.isFree() && "google".contains(ele.getDevelopedBy()))
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

		// Find all ApplicaionDTo where version greter than 5 and collect only name
		System.out.println(System.lineSeparator());
		System.out.println(" Find all ApplicaionDTo where version greter than 5 and collect only name");
		application.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele.getName()));

		System.out.println(
				"________________________________________________________________________________________________________________");

		Collection<DataBaseVendorDTO> dataBaseVenderDTOs = new LinkedList<DataBaseVendorDTO>();
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Enterprice", "Nikil", VesrionType.DDl, 2.5D, 150));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Home", "Guru", VesrionType.DML, 3.1, 250));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Hospital", "Jeevika", VesrionType.DOL, 1.2, 100));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("State", "Omkar", VesrionType.DQL, 5.5, 500));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Country", "Hareesha", VesrionType.SQL, 6.1, 99));

		// Find all Databasee venderDTo Convert DevelopedBy Upper case And Print all Dto
		System.out.println(System.lineSeparator());
		System.out.println("Find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto");
		// Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl
		dataBaseVenderDTOs.stream().filter(ele -> ele.getLicennseCost() > 100 && ele.getDevelopedBy().contains("SQL"))
				.forEach(dto -> System.out.println(dto));
		System.out.println(System.lineSeparator());
		System.out.println("Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl");
		dataBaseVenderDTOs.stream().filter(ele -> ele.getSize() < 100 && ele.getType().equals("DQL"))
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

		// print all DatabaseVendor Dto Types
		System.out.println(System.lineSeparator());
		System.out.println("print all DatabaseVendor Dto Types");
		dataBaseVenderDTOs.stream().map(ele -> ele.getType()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

		System.out.println(
				"________________________________________________________________________________________________________________");

		Collection<CompnayCEODTO> companyCEODTOs = new LinkedList<CompnayCEODTO>();
		companyCEODTOs.add(new CompnayCEODTO("Omkar", "Xworkz", 20, "india", "BE/Btech", true, null));
		companyCEODTOs.add(new CompnayCEODTO("Hareesha", "TechRef", 14, "india", "BE/Btech/Bcom/Bse", false, null));
		companyCEODTOs.add(new CompnayCEODTO("Ravi", "First America", 35, "india", "MBA/Mse/Mcom", true, null));
		companyCEODTOs.add(new CompnayCEODTO("Madhu", "Signiwins", 38, "india", "BE/Msc/Btech/MBA", false, null));
		companyCEODTOs.add(new CompnayCEODTO("Vinoda", "BNV", 7, "india", "BE/Btech/MCA", true, null));
		Collection<DaughterDTO> daugtherDTOs = new LinkedList<DaughterDTO>();
		daugtherDTOs.add(new DaughterDTO("Killer", 9620753670l, 24, false, true));
		daugtherDTOs.add(new DaughterDTO("IceCreame", 6363646456l, 24, true, true));
		daugtherDTOs.add(new DaughterDTO("Dimple ", 9244537206L, 32, false, false));
		daugtherDTOs.add(new DaughterDTO("Sweety", 7464578945L, 26, true, false));
		daugtherDTOs.add(new DaughterDTO("Chinne", 6352145144L, 24, true, false));
		// Print Detiles of CompanyCEO Dtos Daathoughter Dto
		System.out.println(System.lineSeparator());
		System.out.println("print detiles of companyCEO Dtos Daathoughter Dto");
		companyCEODTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Dauthor dtos");
		daugtherDTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		// print all Daughtor Dto names Of Company CEOs
		System.out.println(System.lineSeparator());
		System.out.println("print all Daughtor Dto names Of Company Ceos");
		daugtherDTOs.stream().map(ele -> ele.getName()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		// Get toatal CompanyDtos where age is Gretherthan 30
		System.out.println(System.lineSeparator());
		System.out.println("Get toatal CompanyDtos where age is Gretherthan 30");
		companyCEODTOs.stream().filter(ele -> ele.getAge() > 30).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		// print Below formate from CompanyCetdto father age 7 doughter age 0
		System.out.println(System.lineSeparator());
		System.out.println("print Below formate from CompanyCetdto  father age 7 doughter age ");
		daugtherDTOs.stream().filter(ele -> ele.getAge() >= 7).forEach(ele -> System.out.println(ele.getAge() == 0));
		System.out.println(
				"________________________________________________________________________________________________________________");

	}
}
