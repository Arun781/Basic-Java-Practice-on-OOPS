package com.xworkz.view.tv;

public class Sony {
	public String name;
	public int price ;
	public double model;
	public String type;
	public String colurs;
	public String [] brand;
	public String [] varity;
	public String [] gurranty;
	public String [] channel;
	public String [] movies;
	
	public Sony () {
		System.out.println("Declaring the information TV");
	}
	public Sony(String name,int price,double model,String type,String colurs,String [] brand,String [] varity,String [] gurranty,
			String [] channel,String [] movies) {
		this.name=name;
		this.price=price;
		this.model=model;
		this.type=type;
		this.colurs=colurs;
		this.brand=brand;
		this.varity=varity;
		this.gurranty=gurranty;
		this.channel=channel;
		this.movies=movies;	
	}
	
	public void Display() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.model);
		System.out.println(this.type);
		System.out.println(this.colurs);
		System.out.println(this.brand);
		System.out.println(this.varity);
		System.out.println(this.gurranty);
		System.out.println(this.channel);
		System.out.println(this.movies);
		System.out.println(System.lineSeparator());
		
		for (int i = 0; i < brand.length; i++) {
			String ref = brand[i];
			System.out.println(ref);
		}
		for (int i = 0; i < varity.length; i++) {
			String ref = varity[i];
			System.out.println(ref);
		}
		for (int i = 0; i < gurranty.length; i++) {
			String ref = gurranty[i];
			System.out.println(ref);
		}
		for (int i = 0; i < channel.length; i++) {
			String ref = channel[i];
			System.out.println(ref);
		}
		for (int i = 0; i < movies.length; i++) {
			String ref = movies[i];
			System.out.println(ref);
		}

	}
	
}
