package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Metro;

public class MetroRunner {

	public static void main(String[] args )
	{
		String[]colors= {"Green","purple"};
		int[]distance= {5,10,16};
		String[]compartmentNames= {"General","Ladies","RestRoom"};
		String[]stationName= {"RajajiNagar","BTM"};
		String[]stationManagerName= {"Raju","Ramu"};
		int[] stationManagerNumber= {972673153,948086183};
		String RajajiNagar;
		String[] compartmentName;
		Metro metro=new Metro("Namma Metro", "RajajiNagar", "BTM", 40, true, colors, compartmentNames, stationName, stationManagerName,stationManagerNumber);
		
		
		metro.display();
		
		

	}

}

package com.xworkz.view.boot;

public class Ad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
