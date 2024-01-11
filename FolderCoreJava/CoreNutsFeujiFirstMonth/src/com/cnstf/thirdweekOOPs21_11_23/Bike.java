package com.cnstf.thirdweekOOPs21_11_23;

public class Bike extends Vehicles{
	@Override
	public Bike wheel()
	{
		System.out.println("bike  have 2  wheels");
		return new Bike();
	}
}
