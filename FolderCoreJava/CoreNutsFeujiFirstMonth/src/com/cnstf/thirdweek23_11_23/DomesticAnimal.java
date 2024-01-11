package com.cnstf.thirdweek23_11_23;

public class DomesticAnimal extends Animal{
	String name;
	static String m="swd";
	public DomesticAnimal() {
		super.type="domestic animals";
		this.name="Domestic";
		
		
		System.out.println("DomesticAnimal constructors");
		
	}
	DomesticAnimal(String type, String food)
	{
		
		this();
			System.out.println("i mexecuting domestic class constructor");
		super.type="domestic animals paraeter const";
		this.type="animal class type";
		 
		this.food="animal class food";
		
	}

	
}
