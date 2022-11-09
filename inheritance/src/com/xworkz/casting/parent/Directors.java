package com.xworkz.casting.parent;

public class Directors {
	public int noOfMovies;
	public double eraStarted;
	public String firstMovie;

	public Directors() {
		System.out.println("Created default constructor of Directors class");
	}

	public Directors(int noOfMovies, double eraStarted, String firstMovie) {
		super();
		this.noOfMovies = noOfMovies;
		this.eraStarted = eraStarted;
		this.firstMovie = firstMovie;
	}

	public void showwOff() {
		System.out.println(noOfMovies);
		System.out.println(eraStarted);
		System.out.println(firstMovie);
	}

}
