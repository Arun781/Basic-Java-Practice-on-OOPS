package com.xworkz.casting.runner;

import com.xworkz.casting.main.*;

public class CourtRunner {

	public static void main(String[] args) {
		SupremeCourt ref=new SupremeCourt();
		System.out.println(ref.name);
		System.out.println(ref.staffCount);
		System.out.println(ref.area);
		System.out.println(ref.location);
		System.out.println("================================================================");
		
		Court court=new SupremeCourt();
		System.out.println(court.name);
		System.out.println(court.staffCount);
		SupremeCourt court2=(SupremeCourt)court;   //casting
		System.out.println(court2.area);
		System.out.println(court2.location);
		System.out.println("================================================================");
		
		
		Court court3=new HighCourt();
		System.out.println(court3.name);
		System.out.println(court3.staffCount);
		HighCourt court4=(HighCourt)court3;    //casting
		System.out.println(court4.nameOfJudge);
		System.out.println(court4.NameOfState);
		System.out.println("================================================================");
		
		Court court5=new DistrictCourt();
		System.out.println(court5.name);
		System.out.println(court5.staffCount);
		DistrictCourt court6=(DistrictCourt)court5;   //casting
		System.out.println(court6.noOfCases);
		System.out.println(court6.nameOfAdvocate);
		System.out.println("================================================================");

	}

}
