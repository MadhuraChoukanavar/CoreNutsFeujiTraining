package com.cnstf.thirdweek23_11_23;
//2.write a program to cover constructor chaining this statement and this super key words
public class Animal {
	
	String type;
	String food;
	public Animal(String type, String food) {
		super();
		this.type = type;
		this.food = food;
		
	}
	public Animal() {
		this("type animal", "food");
		
	}
	 void m1()
	 {
	 }
	

}
