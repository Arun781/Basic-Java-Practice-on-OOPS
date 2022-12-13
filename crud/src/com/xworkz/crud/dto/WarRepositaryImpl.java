package com.xworkz.crud.dto;

import com.xworkz.crud.repository.ArrayisfullnowDontAddMore;
import com.xworkz.crud.repository.WarRepositary;

public class WarRepositaryImpl implements WarRepositary {

	War[] war = new War[10];
	private int index = 0;

	@Override
	public boolean creating(War war1) {
		if (this.index >=war.length) {
			System.out.println("Exception Initialize");
			throw new ArrayisfullnowDontAddMore();
		}

		this.war[this.index] = war1;
		System.out.println("Saved:" + war + "In index" + this.index);
		index++;

		return false;
	}

	public War tempwar(String tempWarName) {
		for(War war : war) {
			String tempName = war.getStartedBy();
			if(war!=null && tempName.equals(tempWarName)) {
				System.out.println(tempWarName);
				System.out.println("The following properties are matching");
				System.out.println(war);
				return war;
			}
		}
		return WarRepositary.super.tempwar(tempWarName);

	}
}
