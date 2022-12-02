package com.xworkz.interaction.runner;

import com.xworkz.interaction.rules.DevelopmentInstitute;
import com.xworkz.interaction.rules.Institute;
import com.xworkz.interaction.rules.TestingInstitute;
import com.xworkz.interaction.rules.Xworkz;
import com.xworkz.interaction.rules.XworkzRajajinagar;

public class InstituteRunner {

	public static void main(String[] args) {
		Object obj = new XworkzRajajinagar();//9
		XworkzRajajinagar xworkzRajajinagar = new XworkzRajajinagar();//10
		Xworkz xworkz = new XworkzRajajinagar();//11
		TestingInstitute testingInstitute = new XworkzRajajinagar();//11
		DevelopmentInstitute developmentInstitute = new XworkzRajajinagar ();//11
		Institute institute = new XworkzRajajinagar ();//11
		
		institute.teaching();
		System.out.println("______________________________________________________");
		developmentInstitute.teaching();
		developmentInstitute.nameOfPro();
		System.out.println("______________________________________________________");
		xworkz.teaching();
		xworkz.nameOfPro();
		System.out.println("______________________________________________________");
		testingInstitute.teaching();
		System.out.print("---->");testingInstitute.numOfTrainees();
		testingInstitute.nameOfPro();
		System.out.println("______________________________________________________");
		xworkzRajajinagar.teaching();
		System.out.print("---->");xworkzRajajinagar.numOfTrainees();
		xworkzRajajinagar.nameOfPro();
		System.out.println("______________________________________________________");
	}

}
