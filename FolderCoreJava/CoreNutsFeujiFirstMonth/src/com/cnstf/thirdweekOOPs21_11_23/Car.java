package com.cnstf.thirdweekOOPs21_11_23;

public class Car extends Vehicles{
	@Override
	public Bike wheel() throws ArithmeticException
	{
		System.out.println("car  have 4  wheels");
		return new Bike();
	}

}
