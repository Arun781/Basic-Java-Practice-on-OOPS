package com.xworkz.association.constant;

public enum Height {
pillars_1(250,"Square","Metro"),pillars_2(300,"Round","Construction"),pillars_3(200,"Square","ShowOff");
	public int height1;
	public String shape;
	public String supporting;
	private Height(int height1,String shape,String supporting) {
		this.height1=height1;
		this.shape=shape;
		this.supporting=supporting;
	}
	
}
