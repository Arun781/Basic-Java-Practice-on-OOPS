package com.xworkz.sudowdo.main;

public class Tractor {
      public String name="Sonalika Sikander DI 35";
      public String brand="Mahindra";
      public double price =325000d;
      public String color ="Blue";
      public double model=2022;
      public int hp=50;
      public Tractor(String name) {
    	  this.name=name;
    	  System.out.println("Default name of the Tractor");
      }
      public Tractor(String name,String brand) {
    	  this(name);
    	  this.brand=brand;
      }
      public Tractor(String name,String brand,double price) {
    	  this(name,brand);
    	  this.price=price;
      }
      public Tractor(String name,String brand,double price,String color) {
    	  this(name,brand,price);
    	  this.color=color;
      }
      public Tractor(String name,String brand,double price,String color,double model) {
    	  this(name,brand,price);
    	  this.model=model;
      }
      public Tractor(String name,String brand,double price,String color,double model,int hp) {
    	  this(name,brand,price);
    	  this.hp=hp;
      }
      
}
