package com.xworkz.view;

import com.xworkz.view.constant.UnicWord;

public class UniqueFellow {
	public String name;
	public long num;
	public String numId;
	public String uniqueAbout;
	public UnicWord unicWord = UnicWord.Introvert;
	public UnicWord unicWord1 = UnicWord.Extrovert;
	public UnicWord unicWord2 = UnicWord.Arun;
	
	
	
	public UniqueFellow(String name, long num, String numId, String uniqueAbout, UnicWord unicWord,UnicWord unicWord1,UnicWord unicWord2 ) {
		this.name = name;
		this.num = num;
		this.numId = numId;
		this.uniqueAbout = uniqueAbout;
		this.unicWord = unicWord;
		this.unicWord1=unicWord1;
		this.unicWord1=unicWord2;
	}
	public void Display() {
		System.out.println(this.name);
		System.out.println(this.num);
		System.out.println(this.numId);
		System.out.println(this.uniqueAbout);
		System.out.println(this.unicWord);
		System.out.println(this.unicWord1);
		System.out.println(this.unicWord2);
	}
	
}
 