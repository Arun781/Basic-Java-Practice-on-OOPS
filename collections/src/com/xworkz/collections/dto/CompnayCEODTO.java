package com.xworkz.collections.dto;

public class CompnayCEODTO {
	private String name;
	private String compnay;
	private int age;
	private String country;
	private String qualififcation;
	private boolean married;
	private DaughterDTO daughterDTO;
	
	public CompnayCEODTO() {
		System.out.println("Running No Arguments :-");
	}

	public CompnayCEODTO(String name, String compnay, int age, String country, String qualififcation, boolean married,
			com.xworkz.collections.dto.DaughterDTO daughterDTO) {
		super();
		this.name = name;
		this.compnay = compnay;
		this.age = age;
		this.country = country;
		this.qualififcation = qualififcation;
		this.married = married;
		this.daughterDTO = daughterDTO;
	}

	@Override
	public String toString() {
		return "CompnayCEODTO [name=" + name + ", compnay=" + compnay + ", age=" + age + ", country=" + country
				+ ", qualififcation=" + qualififcation + ", married=" + married + ", daughterDTO=" + daughterDTO + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CompnayCEODTO) {
				CompnayCEODTO CompnayCEODTO = (CompnayCEODTO) obj;{
					if(name.equals(this.name) && age==this.age) {
						System.out.println("The name and age is matching");
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

	public String getCompnay() {
		return compnay;
	}

	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualififcation() {
		return qualififcation;
	}

	public void setQualififcation(String qualififcation) {
		this.qualififcation = qualififcation;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaughterDTO getDaughterDTO() {
		return daughterDTO;
	}

	public void setDaughterDTO(DaughterDTO daughterDTO) {
		this.daughterDTO = daughterDTO;
	}
	
	
}
