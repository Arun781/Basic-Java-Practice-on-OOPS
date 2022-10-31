package com.xworkz.association.array;

import com.xworkz.association.constant.Gender;

public class President {
	public String name;
	public int tensure;
	public Gender gender = Gender.Male;
	
	public President(String name,int tensure, Gender gender) {
		this.tensure = tensure;
		this.gender = gender;
		this.name=name;
	}
	
	
	public void ShowOffer() {
		System.out.println(this.name);
		System.out.println(this.tensure);
		System.out.println(Gender.Male);

	}
}
