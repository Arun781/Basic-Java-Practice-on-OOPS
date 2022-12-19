package com.xworkz.crud.service;

import javax.activity.InvalidActivityException;

import com.xworkz.crud.constant.Names;
import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.InvalidBakeryException;
import com.xworkz.crud.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	
	
	private BakeryRepository bakeryRepository;
	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		this.bakeryRepository=bakeryRepository;
	}
	@Override
	public boolean validateAndSave(BakeryDTO bakeryDTO) throws InvalidBakeryException {
		System.out.println("Running the BakeryServiceImpl:-"+bakeryDTO);
		 Names name = Names.AlbertBakery;
		 String ownerName=bakeryDTO.getOwnerName();
		 String location=bakeryDTO.getLocation();
		 long pNo=bakeryDTO.getpNo();
		 String famousFor=bakeryDTO.getFamousFor();
		 boolean validname = false;
		 boolean validownerName=false;
		 boolean validlocation=false;
		 boolean validpNo=false;
		 boolean validfamousFor=false;
		 if(name!=null) {
			 System.out.println("The name is Valid:-"+name);
			 validname = true;
		 }else {
			 System.out.println("The name is not valid:-"+name);
		 }
		 if(ownerName!=null && ownerName.length()>=3 && ownerName.length()<=20) {
			 System.out.println("The ownerName is valid :-"+ownerName);
			 validownerName=true;
		 }else {
			 System.out.println("The ownerName is not valid:-"+ownerName);
		 }
		 if(location!=null && location.length()>=3 && location.length()<=20) {
			 System.out.println("The location is valid :-"+location);
			 validlocation=true;
		 }else {
			 System.out.println("The location is not valid:-"+location);
		 }
		 if(pNo>500 && pNo<987654321) {
			 System.out.println("The pNo is valid :-"+pNo);
			 validpNo=true;
		 }else {
			 System.out.println("The pNo is not valid :-"+pNo);
		 }
		 if(famousFor!=null && famousFor.length()>=3 && famousFor.length()<=20) {
			 System.out.println("The famousFor is valid :-"+famousFor);
			 validfamousFor=true;
		 }else {
			 System.out.println("The famousFor is not valid :-"+famousFor);
		 }
		 if(validname && validownerName && validlocation && validpNo && validfamousFor) {
			 System.out.println("The validation is valid and you can save the data"+bakeryDTO);
			 boolean saved = bakeryRepository.save(bakeryDTO);
			 System.out.println("The data is valid and saved to repository:-"+saved);
			 return saved;
		 }else {
			 throw new InvalidBakeryException("Check the data you have entered :-");
		 }
		
	}

}
