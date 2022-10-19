package com.xworkz.view.send;

public class ParcelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String [] parcelNames= {"DTDC","VRL","COURIER"};
		 String [] transpotedBy= {"Bussines","Commercial"};
		 String [] servie= {"bus","Truck"};
		 String [] diffirent = {"Travelling","By relatives"};
		 String [] transportBy= {"Train","Sea Ways","AirBUs"};
		 Parcel prefer = new Parcel("XYZ","Mysore",250,1.5f,965874965l,parcelNames,transpotedBy,servie,diffirent,transportBy);
		 prefer.display();
		

	}

}
