package com.xworkz.crocoFestival.thing;

public interface PetrolBunk {
	
	default void purchase() {
		System.out.println("Created the purchase");
	}

}
