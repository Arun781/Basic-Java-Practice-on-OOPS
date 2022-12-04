package com.xworkz.interaction.rules;

public class HospitalManagement {

	private VisitorsRules rules;

	public HospitalManagement() {
		System.out.println("Creating the Default Constructor");
	}

	public HospitalManagement(VisitorsRules rules) {
		super();
		this.rules = rules;
		System.out.println("Running the parameterize constructor");
	}

	public void checkVisitor() {
		System.out.println("Runnint the Check Visitorss");
		if (this.rules != null) {
			boolean smoking = this.rules.smoking();
			int minDeposit = this.rules.minDeposit();
			if(smoking==true && minDeposit==1) {
				System.out.println("The visitors is must follow the rules");
			}
			else {
				System.out.println("The visitors is must not follow the rules");
			}
		}
	}
}
