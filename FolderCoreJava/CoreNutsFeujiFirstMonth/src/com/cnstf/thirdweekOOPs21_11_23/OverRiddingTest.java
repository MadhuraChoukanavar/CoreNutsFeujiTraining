package com.cnstf.thirdweekOOPs21_11_23;
//4 write a program to show dynamic polymorphism behavior with all rules

public class OverRiddingTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Vehicles v=new Vehicles();
		v.wheel();
		Vehicles v1=new Car();
		v1.wheel();
		//if we try to convert super class object to subclass class cast exception will be given
//		Car c=(Car) new Vehicles();
//		c.wheel();
	}
	

}




//notes:--we can return type of sub class type or same type in sub class
//we can have sub class type of exception or same type in subclass 
//subclass should throw same type exception or sub class exception of exception which super class is throwing
//but if super cls is throwing indexoutofbound and subclass arithmetic it is valid
//but parent class have unchecked and sub class having check exception it will throw error but vice versa can bethr
//we should not decrees the visibility ex if parent is having private and sub class is having protected it will throw error
//arrguments should be same