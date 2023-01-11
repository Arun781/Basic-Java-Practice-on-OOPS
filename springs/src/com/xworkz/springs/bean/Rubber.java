package com.xworkz.springs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String rubberName;
	@Autowired
	@Qualifier("rubberType")
	private String rubberType;
	@Autowired
	@Qualifier("rubberColur")
	private String rubberColur;
	@Autowired
	@Qualifier("rubberShape")
	private String rubberShape;
	@Autowired
	@Qualifier("rubberPrice")
	private int rubberPrice;
	@Autowired
	@Qualifier("rubberSize")
	private float rubberSize;
	@Autowired
	@Qualifier("RubberStolen")
	private boolean RubberStolen;

	public Rubber() {
		System.out.println("Running the Rubber no arg const");
	}

	@Override
	public String toString() {
		return "Rubber [rubberName=" + rubberName + ", rubberType=" + rubberType + ", rubberColur=" + rubberColur
				+ ", rubberShape=" + rubberShape + ", rubberPrice=" + rubberPrice + ", rubberSize=" + rubberSize
				+ ", RubberStolen=" + RubberStolen + "]";
	}

	

}
