package com.cnstf.thirdweekOOPs21_11_23;

public class Tiger extends Animal1{
	String name="tiger";
	@Override
	public void eating()
	{
		
		//super.age=10;
		System.out.println("tiger will eat grass");
		
	}
	public void roaring()
	{
		System.out.println("tiger will roar");
	}
	public static void main1(String[] args) {
		//this.name="name";  can't use this in static
		//super.name="fghjk"; can't use super in static
	}
}
