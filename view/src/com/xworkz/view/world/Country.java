package com.xworkz.view.world;

import com.xworkz.view.constant.Limits;

public class Country {
	public String name;
	public String capitalCity;
	public long population;
	public String currency;
	public String bestOfIndia;
	public Limits limits  = Limits.Addar_Num;
	public Limits limits1  = Limits.Driving_licence;
	public String [] state;
	public String [] nameOfPM;
	public String [] lanaguage;
	public String [] sea;
	public Country(String name, String capitalCity, long population, String currency, String bestOfIndia, Limits limits,
			Limits limits1, String[] state, String[] nameOfPM, String[] lanaguage, String[] sea) {
		this.name = name;
		this.capitalCity = capitalCity;
		this.population = population;
		this.currency = currency;
		this.bestOfIndia = bestOfIndia;
		this.limits = limits;
		this.limits1 = limits1;
		this.state = state;
		this.nameOfPM = nameOfPM;
		this.lanaguage = lanaguage;
		this.sea = sea;
	}
		public void display() {
			System.out.println(this.name);
			System.out.println(this.capitalCity);
			System.out.println(this.population);
			System.out.println(this.currency);
			System.out.println(this.bestOfIndia);
			System.out.println(this.limits);
			System.out.println(this.limits1);
			System.out.println(this.state);
			System.out.println(this.nameOfPM);
			System.out.println(this.lanaguage);
			System.out.println(this.sea);
			
			System.out.println(System.lineSeparator());
			for (int i = 0; i < state.length; i++) {
				String ref = state[i];
				System.out.println(ref);
			}
			for (int i = 0; i < nameOfPM.length; i++) {
				String ref = nameOfPM[i];
				System.out.println(ref);
			}
			for (int i = 0; i < lanaguage.length; i++) {
				String ref = lanaguage[i];
				System.out.println(ref);
			}
			for (int i = 0; i < sea.length; i++) {
				String ref = sea[i];
				System.out.println(ref);
			}
			



			
			
		}
		
		
	}
	
	

