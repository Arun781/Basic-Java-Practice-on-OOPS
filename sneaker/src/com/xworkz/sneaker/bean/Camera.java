package com.xworkz.sneaker.bean;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private String lens;
	private Battery Battery;
	public Camera() {
		System.out.println("Created camera the no arg const...");
	}

}
