package com.cnstf.Secondweek_11_12_23;
//5.Write a program (Take Class as Car) having static methods and then call 
//the methods in another class with static method reference? 
public class TestMethodReference {
	public static void main(String[] args) {
	 	CarINterface car=Car::speed;
	 	System.out.println(car.speed());
	}
}
