package com.xworkz.association.mainfiles;

import com.xworkz.association.classfiles.Pillars;
import com.xworkz.association.constant.Height;

public class PillarsRunner {

	public static void main(String[] args) {
		// id,place,shape:enum,height,supporting,company
		Pillars pillars = new Pillars(250,"RajajiNagar",Height.pillars_1);
		System.out.println(pillars.company.name="TechMahindra");
		System.out.println(pillars.company.type="Design");
		pillars.ShowOff();
	}

}
