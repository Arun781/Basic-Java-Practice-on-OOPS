package com.xworkz.equals.main;

public class Institution {
	private String name;
	private String location;
	private String dist;
	private String propertyOwned;
	private String leased;
	private int floor;
	private int noOfBuilding;
	private long num;
	private double institutuionCode;
	private String presidentName;
	public Institution() {
		System.out.println("Declaring the properties of Institution for checking equals");
	}
	public Institution(String name, String location, String dist, String propertyOwned, String leased, int floor,
			int noOfBuilding, long num, double institutuionCode, String presidentName) {
		super();
		this.name = name;
		this.location = location;
		this.dist = dist;
		this.propertyOwned = propertyOwned;
		this.leased = leased;
		this.floor = floor;
		this.noOfBuilding = noOfBuilding;
		this.num = num;
		this.institutuionCode = institutuionCode;
		this.presidentName = presidentName;
	}
	@Override
	public String toString() {
		return "Institution [name=" + name + ", location=" + location + ", dist=" + dist + ", propertyOwned="
				+ propertyOwned + ", leased=" + leased + ", floor=" + floor + ", noOfBuilding=" + noOfBuilding
				+ ", num=" + num + ", institutuionCode=" + institutuionCode + ", presidentName=" + presidentName + "]";
	}
	
	public boolean equals(Object college) {
		System.out.println("If object are same return true");
		if(college instanceof Institution )
		{
			System.out.println("If college is Institution,can check the properties ");
			Institution institution= (Institution) college;
			System.out.println(institution);
		}
		else {
			System.out.println("If college is not Institution,cannot check the properties");
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getPropertyOwned() {
		return propertyOwned;
	}
	public void setPropertyOwned(String propertyOwned) {
		this.propertyOwned = propertyOwned;
	}
	public String getLeased() {
		return leased;
	}
	public void setLeased(String leased) {
		this.leased = leased;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getNoOfBuilding() {
		return noOfBuilding;
	}
	public void setNoOfBuilding(int noOfBuilding) {
		this.noOfBuilding = noOfBuilding;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public double getInstitutuionCode() {
		return institutuionCode;
	}
	public void setInstitutuionCode(double institutuionCode) {
		this.institutuionCode = institutuionCode;
	}
	public String getPresidentName() {
		return presidentName;
	}
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	
	


}
