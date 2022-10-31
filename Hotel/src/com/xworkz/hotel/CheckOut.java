package com.xworkz.hotel;

public class CheckOut{
	
	private int number;
	private String date;
	
	public void CheckIn(int number,String date) {
		this.number = number;
		this.date = date;
	}

	
	public int getNumber() {
		return number;
	}

	
	public void setNumber(int number) {
		this.number = number;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CheckIn [number=" + number + ", date=" + date + "]";
	}
	
	public boolean equals(int number) {
        if(this.number == number) {
        	return true;
        }else {
        	return false;
        }
	}

}
