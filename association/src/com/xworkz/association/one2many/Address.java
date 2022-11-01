package com.xworkz.association.one2many;

public class Address {
	public Location location;

	public void setlocation(Location location) {

		this.location = location;
	}

	public void ShowOff() {
		if (this.location != null) {
			location.ShowOff();
		}
	}
}
