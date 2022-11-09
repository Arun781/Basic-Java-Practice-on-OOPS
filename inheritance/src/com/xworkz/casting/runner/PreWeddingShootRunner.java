package com.xworkz.casting.runner;

import com.xworkz.casting.main.PhotoShoot;
import com.xworkz.casting.main.PreWeddingShoot;
import com.xworkz.enums.Camcorder;

public class PreWeddingShootRunner {

	public static void main(String[] args) {
		PreWeddingShoot ref = new PreWeddingShoot("Varun","Dandeli",Camcorder.DSLR);
		ref.Showoff();
		System.out.println("===============================================");
		PhotoShoot PhotoShoot = new PhotoShoot();
		System.out.println(PhotoShoot.location);
		System.out.println(PhotoShoot.name);
		System.out.println(PhotoShoot.num);
		System.out.println(PhotoShoot.name);
		
	}

}
