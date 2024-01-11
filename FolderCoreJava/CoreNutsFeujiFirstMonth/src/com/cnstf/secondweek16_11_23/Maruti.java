package com.cnstf.secondweek16_11_23;
//one class can implement more than one interface

public class Maruti implements Car,Petrol {

	
	Car maruthi=new Maruti();
	//we can't change the value in sub class it will throw error
	//maruthi.name="maruti";
	@Override
	public void steering() {
	System.out.println("maruthi dont have auto steering");
		
	}

	@Override
	public void openRoof() {
		System.out.println("maruthi have open roof");
		
	}

	@Override
	public void petrol() {
	System.out.println("maruti use petrol");
		
	}

}
