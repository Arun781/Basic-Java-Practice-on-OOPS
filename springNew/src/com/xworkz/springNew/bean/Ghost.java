package com.xworkz.springNew.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	@Qualifier("nameGhost")
	private String nameGhost;
	@Autowired
	@Qualifier("friendName")
	private String friendName;
	@Autowired
	@Qualifier("freindCrush")
	private String freindCrush;
	@Autowired
	@Qualifier("brotherName")
	private String brotherName;
	@Autowired
	@Qualifier("sisterName")
	private String sisterName;
	@Autowired
	@Qualifier("villageName")
	private String villageName;
	@Autowired
	@Qualifier("talukName")
	private String talukName;
	@Autowired
	@Qualifier("distName")
	private String distName;
	@Autowired
	@Qualifier("stateName")
	private String stateName;
	@Autowired
	@Qualifier("countryName")
	private String countryName;
	@Autowired
	@Qualifier("wifeName")
	private String wifeName;
	private String exGfName;
	private long num;
	private float height;
	private float weight;
	private boolean alive;
	private boolean leg;
	private boolean hand;
	private boolean head;
	private boolean eyes;
	private boolean hairs;

	public Ghost(@Qualifier("exBfName") String exGfName,@Qualifier("num") long num,
			@Qualifier("height") float height,@Qualifier("weight") float weight,
			@Qualifier("alive") boolean alive,@Qualifier("leg") boolean leg,@Qualifier("hand") boolean hand,
			@Qualifier("head") boolean head,@Qualifier("eyes") boolean eyes,@Qualifier("hairs") boolean hairs) {
		super();
		this.exGfName = exGfName;
		this.num = num;
		this.height = height;
		this.weight = weight;
		this.alive = alive;
		this.leg = leg;
		this.hand = hand;
		this.head = head;
		this.eyes = eyes;
		this.hairs = hairs;
	}

	@Override
	public String toString() {
		return "Ghost [nameGhost=" + nameGhost + ", friendName=" + friendName + ", freindCrush=" + freindCrush + ", brotherName="
				+ brotherName + ", sisterName=" + sisterName + ", villageName=" + villageName + ", talukName="
				+ talukName + ", distName=" + distName + ", stateName=" + stateName + ", countryName=" + countryName
				+ ", wifeName=" + wifeName + ", exGfName=" + exGfName + ", num=" + num + ", height=" + height
				+ ", weight=" + weight + ", alive=" + alive + ", leg=" + leg + ", hand=" + hand + ", head=" + head
				+ ", eyes=" + eyes + ", hairs=" + hairs + "]";
	}

}
