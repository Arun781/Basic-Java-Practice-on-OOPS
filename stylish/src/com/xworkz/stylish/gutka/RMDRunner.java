package com.xworkz.stylish.gutka;

public class RMDRunner {

	public static void main(String[] args) {
		System.out.println("Declaring the and initializing information of the RMD");
		System.out.println("=====================================================");
		RMD ban=new RMD();
		ban.fullName="Rasiklal Manikchand Dhariwal";
		ban.brand="its has his own brand";
		ban.company="Manikchand Group";
		ban.director="Mr Rasik 'Manikchand' Dhariwal";
		ban.place="Shirur";
		ban.price=15;
		ban.quantity=15;
		ban.percentage=3.5f;
		System.out.println("=====================================================");
		RMD banned=new RMD();
		System.out.println(banned.category);
		System.out.println(banned.productsAndServices);
		System.out.println(banned.type);
		System.out.println(banned.subcategory);
		System.out.println(banned.company);
		System.out.println(banned.companyEmail);
		System.out.println(banned.regestredAddress);
		System.out.println(banned.industry);
		System.out.println(banned.paidUpCapital);
		System.out.println(banned.authorisedCapital);
		System.out.println("=====================================================");

	}

}
