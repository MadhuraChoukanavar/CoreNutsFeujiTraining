package com.cnstf.Secondweek_11_12_23;

public class NonStaticMethodReference {
	
	public static void main(String[] args) {
		Calculate calculate=new Calculate();
		CalculateInterface cal= calculate::addOfClass;
		System.out.println(cal.add(10,20));
	}

}
