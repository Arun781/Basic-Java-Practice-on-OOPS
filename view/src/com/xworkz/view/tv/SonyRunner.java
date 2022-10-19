package com.xworkz.view.tv;

public class SonyRunner {

	public static void main(String[] args) {
		String [] brands = {"Sony","LG","Vodafone"};
		String [] varities = {"Doom Type","TV","Smart TV"};
		String [] warranty = {"6 months","1 years"};
		String [] channels = {"Sony","SonyLive","ZEE5"};
		String [] movies = {"KGF","KANTARA","MALUPU"};
		Sony prefer = new Sony("SONY",255,2022,"XEPIRIA","BLACK",brands,warranty,channels,varities,movies);
		prefer.Display();
	}

}
