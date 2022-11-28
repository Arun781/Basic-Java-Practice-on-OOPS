package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.Branch;
import com.xworkz.interaction.rules.Banking;

public class BranchRunner {

	public static void main(String[] args) {
		Branch ref = new Branch();
		ref.branch();
		ref.idNumber();
		ref.managerName();
		ref.name();
		ref.pinNo();
		System.out.println("___________________________________________");
		Banking ref1 = new Branch();
		ref1.branch();
		ref1.idNumber();
		ref1.managerName();
		ref1.name();
		ref1.pinNo();

	}

}
