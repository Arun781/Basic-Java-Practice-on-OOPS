package com.xworkz.collections.dto;

import java.io.Serializable;

public class DaughterDTO implements Serializable{
	private String name;
	private long mobileNum;
	private int age;
	private boolean commited;
	private boolean alive;
	
	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobileNum=" + mobileNum + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}

	public DaughterDTO(String name, long mobileNum, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DaughterDTO) {
				DaughterDTO daughterDTO = (DaughterDTO) obj;{
					if(name.equals(this.name) && age==this.age) {
						System.out.println("The name and age is Matching");
					}
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
