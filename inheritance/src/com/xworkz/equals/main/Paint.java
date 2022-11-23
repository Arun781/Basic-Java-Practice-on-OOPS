package com.xworkz.equals.main;

public class Paint {
	
	private String brandName;
	private double price;
	private double code;
	private String colur;
	private String shopName;
	private String ownerName;
	private long ownerNum;
	private boolean waterResistance;
	private boolean heatResistance;
	private String type;
	private String durability;
	
	public Paint() {
		System.out.println("Declaring the properties of paint for checking equals");
	}

	public Paint(String brandName, double price, double code, String colur, String shopName, String ownerName,
			long ownerNum, boolean waterResistance, boolean heatResistance, String type, String durability) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.code = code;
		this.colur = colur;
		this.shopName = shopName;
		this.ownerName = ownerName;
		this.ownerNum = ownerNum;
		this.waterResistance = waterResistance;
		this.heatResistance = heatResistance;
		this.type = type;
		this.durability = durability;
	}

	@Override
	public String toString() {
		return "Paint [brandName=" + brandName + ", price=" + price + ", code=" + code + ", colur=" + colur
				+ ", shopName=" + shopName + ", ownerName=" + ownerName + ", ownerNum=" + ownerNum
				+ ", waterResistance=" + waterResistance + ", heatResistance=" + heatResistance + ", type=" + type
				+ ", durability=" + durability + "]";
	}
	@Override
	public boolean equals(Object colur) {
		System.out.println("Running equals method in Paint");
		if(colur instanceof Paint) {
			System.out.println("If colur is Paint ,can check the properties");
			Paint paint = (Paint) colur;
			//System.out.println(paint);
		}
		else {
			System.out.println("If colur is not Paint, cannot check the properties");
		}
		return false;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getcode() {
		return code;
	}

	public void setCode(double code) {
		this.code = code;
	}

	public String getColur() {
		return colur;
	}

	public void setColur(String colur) {
		this.colur = colur;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getOwnerNum() {
		return ownerNum;
	}

	public void setOwnerNum(long ownerNum) {
		this.ownerNum = ownerNum;
	}

	public boolean isWaterResistance() {
		return waterResistance;
	}

	public void setWaterResistance(boolean waterResistance) {
		this.waterResistance = waterResistance;
	}

	public boolean isHeatResistance() {
		return heatResistance;
	}

	public void setHeatResistance(boolean heatResistance) {
		this.heatResistance = heatResistance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDurability() {
		return durability;
	}

	public void setDurability(String durability) {
		this.durability = durability;
	}
	
	

}
