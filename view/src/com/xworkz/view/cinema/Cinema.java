package com.xworkz.view.cinema;

import com.xworkz.view.constant.Names;

public class Cinema {
	public String industry;
	public String kannada;
	public String telugu;
	public String hindi;
	public int ticketPrice;
	public Names names = Names.DearComrade;
	public Names names1 = Names.GangLeader;
	public String[] teluguHeroes;
	public String[] horrorMovies;
	public String[] kannadaHeroes;
	public String[] hindiHeroes;
	

	public Cinema(String industry, String kannada, String telugu, String hindi, int ticketPrice, String[] teluguHeroes,
			String[] horrorMovies, String[] kannadaHeroes, String[] hindiHeroes, Names names,
			Names names1) {

		this.industry = industry;
		this.kannada = kannada;
		this.telugu = telugu;
		this.hindi = hindi;
		this.ticketPrice = ticketPrice;
		this.teluguHeroes = teluguHeroes;
		this.horrorMovies = horrorMovies;
		this.kannadaHeroes = kannadaHeroes;
		this.hindiHeroes = hindiHeroes;
		
		this.names = names;
		this.names1 = names1;
	}

	public void displayShow () {
		System.out.println(this.industry);
		System.out.println(this.kannada);
		System.out.println(this.telugu);
		System.out.println(this.hindi);
		System.out.println(this.ticketPrice);
		System.out.println(this.names);
		System.out.println(this.names1);
		System.out.println(this.teluguHeroes);
		System.out.println(this.horrorMovies);
		System.out.println(this.kannadaHeroes);
		System.out.println(this.hindiHeroes);
	

		System.out.println(System.lineSeparator());

		for (int i = 0; i < teluguHeroes.length; i++) {
			String ref = teluguHeroes[i];
			System.out.println(ref);
		}
		for (int i = 0; i < horrorMovies.length; i++) {
			String ref = horrorMovies[i];
			System.out.println(ref);
		}
		for (int i = 0; i < kannadaHeroes.length; i++) {
			String ref = kannadaHeroes[i];
			System.out.println(ref);
		}
		for (int i = 0; i < hindiHeroes.length; i++) {
			String ref = hindiHeroes[i];
			System.out.println(ref);
		}
	

	}

}
