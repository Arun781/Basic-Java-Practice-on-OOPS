package com.xworkz.interaction.bridges;

import com.xworkz.interaction.rules.GirlfriendRules;

public class BoyFriend implements GirlfriendRules{
	public String relationshipIsYourPriority() {
		System.out.println("relationshipIsYourPriority");
		return null;
		
	}
	public String spendTime() {
		System.out.println("spendTime");
		return null;
		
	}
	public boolean dontLie() {
		System.out.println("dontLie");
		return false;
		
	}
	public boolean noHideAndSickGame() {
		System.out.println("noHideAndSickGame");
		return false;
		
	}
	public long gfNum() {
		System.out.println("gfNum");
		return 0;
		
	}
	
}
