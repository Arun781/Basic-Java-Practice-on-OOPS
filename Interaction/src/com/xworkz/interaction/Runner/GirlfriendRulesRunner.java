package com.xworkz.interaction.Runner;

import com.xworkz.interaction.bridges.BoyFriend;
import com.xworkz.interaction.rules.GirlfriendRules;

public class GirlfriendRulesRunner {

	public static void main(String[] args) {
		BoyFriend ref = new BoyFriend();
		ref.dontLie();
		ref.noHideAndSickGame();
		ref.relationshipIsYourPriority();
		ref.spendTime();
		ref.gfNum();
		System.out.println("___________________________________");
		GirlfriendRules ref1 = new BoyFriend();
		ref1.dontLie();
		ref1.noHideAndSickGame();
		ref1.relationshipIsYourPriority();
		ref1.spendTime();
		ref1.gfNum();
	}

}
