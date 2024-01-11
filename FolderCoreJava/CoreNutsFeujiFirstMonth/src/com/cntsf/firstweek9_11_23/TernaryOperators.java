package com.cntsf.firstweek9_11_23;

public class TernaryOperators {
	public static void main(String[] args) {
		TernaryOperators terOpp =new TernaryOperators();
		System.out.println(terOpp.ternaryOpp(15));
		System.out.println(terOpp.ternaryOpp(25));
	}
	//if we write the if else lines of code will be more so we can use ternary in that condition
	public boolean ternaryOpp(int age)
	{
		return age<18?true:false;
	}

}
