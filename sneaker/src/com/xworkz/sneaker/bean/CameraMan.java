package com.xworkz.sneaker.bean;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
private Camera camera;
public CameraMan() {
	System.out.println("Created the no arg const of CameraMan");
}
}
