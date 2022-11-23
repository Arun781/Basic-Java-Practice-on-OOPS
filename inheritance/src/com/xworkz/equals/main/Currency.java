package com.xworkz.equals.main;

public class Currency {
	private String country;
	private String portability;
	private String durability;
	private String uniformity;
	private String divisibility;
	private String acceptability;
	private String currencyIn;
	private double currency;
	
	public Currency() {
		System.out.println("Declaring the properties of Currency for checking equals");
	}

	public Currency(String country, String portability, String durability, String uniformity, String divisibility,
			String acceptability, String currencyIn, double currency) {
		super();
		this.country = country;
		this.portability = portability;
		this.durability = durability;
		this.uniformity = uniformity;
		this.divisibility = divisibility;
		this.acceptability = acceptability;
		this.currencyIn = currencyIn;
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		return "Currency [country=" + country + ", portability=" + portability + ", durability=" + durability
				+ ", uniformity=" + uniformity + ", divisibility=" + divisibility + ", acceptability=" + acceptability
				+ ", currencyIn=" + currencyIn + ", currency=" + currency + "]";
	}
	
	public boolean equals(Object country) {
		System.out.println("Running equals method in Currency");
		if(country instanceof Currency) {
			System.out.println("if country is Currency can check the properties");
			Currency currency=(Currency)country;
			System.out.println(currency);
		}
		else {
			System.out.println("if country is not Currency cannot check the properties");
		}
		return false;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPortability() {
		return portability;
	}

	public void setPortability(String portability) {
		this.portability = portability;
	}

	public String getDurability() {
		return durability;
	}

	public void setDurability(String durability) {
		this.durability = durability;
	}

	public String getUniformity() {
		return uniformity;
	}

	public void setUniformity(String uniformity) {
		this.uniformity = uniformity;
	}

	public String getDivisibility() {
		return divisibility;
	}

	public void setDivisibility(String divisibility) {
		this.divisibility = divisibility;
	}

	public String getAcceptability() {
		return acceptability;
	}

	public void setAcceptability(String acceptability) {
		this.acceptability = acceptability;
	}

	public String getCurrencyIn() {
		return currencyIn;
	}

	public void setCurrencyIn(String currencyIn) {
		this.currencyIn = currencyIn;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}
	
	
}
