package com.xworkz.equals.main;

public class WaterBottle {
	private String compnay;
	private String type;
	private String colur;
	private String shape;
	private int contains;
	private double price;
	private boolean quality;
	private String materials;
	private String manufacturedBy;
	private int size;
	
	public WaterBottle() {
		System.out.println("Declaring the properties of Vehicle for checking equals");
	}

	public WaterBottle(String compnay, String type, String colur, String shape, int contains, double price,
			boolean quality, String materials, String manufacturedBy, int size) {
		super();
		this.compnay = compnay;
		this.type = type;
		this.colur = colur;
		this.shape = shape;
		this.contains = contains;
		this.price = price;
		this.quality = quality;
		this.materials = materials;
		this.manufacturedBy = manufacturedBy;
		this.size = size;
	}

	@Override
	public String toString() {
		return "WaterBottle [compnay=" + compnay + ", type=" + type + ", colur=" + colur + ", shape=" + shape
				+ ", contains=" + contains + ", price=" + price + ", quality=" + quality + ", materials=" + materials
				+ ", manufacturedBy=" + manufacturedBy + ", size=" + size + "]";
	}
	public boolean equals(Object ref) {
		System.out.println("Running equals method in WaterBottle");
		if( ref instanceof WaterBottle) {
			System.out.println("if ref is WaterBottle can check the properties");
			WaterBottle bottle= (WaterBottle) ref;
			System.out.println(bottle);
		}
		else {
			System.out.println("if ref is not WaterBottle cannot check the properties");
		}
		return false;
	}
	public String getCompnay() {
		return compnay;
	}

	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColur() {
		return colur;
	}

	public void setColur(String colur) {
		this.colur = colur;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getContains() {
		return contains;
	}

	public void setContains(int contains) {
		this.contains = contains;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
