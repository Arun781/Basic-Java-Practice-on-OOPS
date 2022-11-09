package com.xworkz.casting.runner;

import com.xworkz.casting.main.BdayInvitations;
import com.xworkz.casting.main.HomingCermony;
import com.xworkz.casting.main.Invitations;
import com.xworkz.enums.Card;

public class InvitationRunner {

	public static void main(String[] args) {
		Invitations invitation = new Invitations(25020,250,Card.Digital);
		invitation.showoff();
		System.out.println("==========================================");
		HomingCermony HomingCermony= new HomingCermony("Josh","01/12/22","VijayaNagar",Card.F2F);
		HomingCermony.ShowOff();
		System.out.println("==========================================");
		BdayInvitations bdayInvitations = new BdayInvitations();
		System.out.println(bdayInvitations.name);
	}
	
}
