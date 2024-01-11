package com.cnstf.fourthweekstrings29_11_23;

import java.util.ArrayList;

public class TestFoeWildCArd {
	
	public static void main(String[] args) {
		TestFoeWildCArd testWC=new TestFoeWildCArd();
		ArrayList<Object> upperBo=new ArrayList<>();
		upperBo.add(new RamSon());
		upperBo.add(new RamSon());
		upperBo.add(new RamSon());
		upperBo.add(new RamSon());
		upperBo.add(new Person());
 		//testWC.displayupp(upperBo);
//		ArrayList lowerBo=new ArrayList();
//		lowerBo.add(new RamSon());
//		lowerBo.add(new RamSon());
//		lowerBo.add(new RamSon());
//		lowerBo.add(new Object());
//		lowerBo.add(new Animal());
//		lowerBo.add(new ProcessBuilder());
//		
//		testWC.displayLow(lowerBo);
//		
//	
		
		// here we are going to add char and string and try to display where in display we have restricted 
		//only for number and its child class so when we call display method it will through error
		ArrayList<Object> NumUpBond=new ArrayList<>();
		NumUpBond.add(10);
		NumUpBond.add("gh");
		NumUpBond.add(5677);
		NumUpBond.add('m');
	//	testWC.displayUpNum(NumUpBond);
	}
	
	public void displayupp(ArrayList<? extends Ram> list)
	{
		for(Ram r:list)
		{
			System.out.println(r);
		}
	}
	public void displayLow(ArrayList<? super Ram> list)
	{
		for(Object r:list)
		{
			System.out.println(r);
		}
	}
	public void displayUpNum(ArrayList<? extends Number> list)
	{
		for(Number r:list)
		{
			System.out.println(r);
		}
	}
	
	
}
