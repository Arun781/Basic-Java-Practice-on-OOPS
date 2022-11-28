package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.MagroveForest;
import com.xworkz.interaction.rules.Forest;

public class MagroveForestRunner {

	public static void main(String[] args) {
		MagroveForest ref = new MagroveForest();
		ref.animalAge();
		ref.animalDOB();
		ref.animalSound();
		ref.animalName();
		ref.sleep();
		System.out.println("_______________________________________");
		Forest ref1 = new MagroveForest();
		ref1.animalAge();
		ref1.animalDOB();
		ref1.animalSound();
		ref1.animalName();
		ref1.sleep();

	}

}
