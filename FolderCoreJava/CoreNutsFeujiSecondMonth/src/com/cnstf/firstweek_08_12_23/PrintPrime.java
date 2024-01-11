package com.cnstf.firstweek_08_12_23;

import java.util.function.Predicate;

public class PrintPrime {
	public static void main(String[] args) {
		
	
	Predicate<Integer> prime=(e)->
	{
		return (e==0);
	};
	
System.out.println(prime.test(10));
	}
}
