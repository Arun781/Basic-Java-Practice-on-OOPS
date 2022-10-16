package com.xworkz.sudowdo.runner;
import com.xworkz.sudowdo.main.*;
public class TextTileShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextTileShop ref = new TextTileShop(null);
		ref.ownerName="Ramesh";
		ref.ownerWifeName="Divya Ramesh";
		ref.ownerDaughterName="Devil";
		ref.ownerDaughterNumber=964578962l;
		ref.ownersNoOfWifes ="Only on Wife";		                              /*public String ownersNoOfWifes;*/
		ref.shopNo=255;
		ref.contactNum=965874567l;


		System.out.println("Name Of owner is :-"+ref.ownerName);
		System.out.println("ownerDaughterName is :-"+ref.ownerDaughterName);
		System.out.println("ownerWifeName is :-"+ref.ownerWifeName);
		System.out.println("ownerDaughterName:-"+ref.ownerDaughterName);
		System.out.println("+ownerDaughterNumber:-"+ref.ownerDaughterNumber);
		System.out.println("shopNo:-"+ref.shopNo);
		System.out.println("contactNum:-"+ref.contactNum);
		System.out.println("ownersNoOfWifes:-"+ref.ownersNoOfWifes);
		System.out.println("_________________________________________________________________________________________________");
		TextTileShop ref2= new TextTileShop("Swaraj");
		System.out.println(ref2.ownerName);
		System.out.println("_________________________________________________________________________________________________");

		TextTileShop ref3= new TextTileShop("Swaraj","Shivani");
		System.out.println(ref3.ownerName);
		System.out.println(ref3.ownerDaughterName);
		System.out.println("_________________________________________________________________________________________________");

		TextTileShop ref4= new TextTileShop("Swaraj","Shivani","Deepthi",962548755l);
		System.out.println(ref4.ownerName);
		System.out.println(ref4.ownerDaughterName);
		System.out.println(ref4.ownerWifeName);
		System.out.println("_________________________________________________________________________________________________");

		TextTileShop ref5= new TextTileShop("Swaraj","Shivani","Deepthi",962548755l);
		System.out.println(ref5.ownerName);
		System.out.println(ref5.ownerDaughterName);
		System.out.println(ref5.ownerWifeName);
		System.out.println(ref5.ownersNoOfWifes);
		System.out.println("_________________________________________________________________________________________________");

		TextTileShop ref6= new TextTileShop("Swaraj","Shivani","Deepthi",962548755l,2);
		System.out.println(ref6.ownerName);
		System.out.println(ref6.ownerDaughterName);
		System.out.println(ref6.ownerWifeName);
		System.out.println(ref6.ownersNoOfWifes);
		System.out.println(ref6.shopNo);
		System.out.println("_________________________________________________________________________________________________");

		TextTileShop ref7= new TextTileShop("Swaraj","Shivani","Deepthi",962548755l,2,965248758l);
		System.out.println(ref7.ownerName);
		System.out.println(ref7.ownerDaughterName);
		System.out.println(ref7.ownerWifeName);
		System.out.println(ref7.ownersNoOfWifes);
		System.out.println(ref7.shopNo);
		System.out.println(ref7.contactNum);
		System.out.println("_________________________________________________________________________________________________");

		TextTileShop ref8= new TextTileShop("Swaraj","Shivani","Deepthi",962548755l,2,965248758l,"Papaa Single Wife");
		System.out.println(ref8.ownerName);
		System.out.println(ref8.ownerDaughterName);
		System.out.println(ref8.ownerWifeName);
		System.out.println(ref8.ownersNoOfWifes);
		System.out.println(ref8.shopNo);
		System.out.println(ref8.contactNum);
		System.out.println(ref8.ownersNoOfWifes);
		System.out.println("_________________________________________________________________________________________________");

		

		
		
				
		

	}

}
