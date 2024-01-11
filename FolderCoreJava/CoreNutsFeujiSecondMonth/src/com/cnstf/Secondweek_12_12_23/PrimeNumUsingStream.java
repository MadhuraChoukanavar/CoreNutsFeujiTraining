package com.cnstf.Secondweek_12_12_23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//3. Create a new list of prime numbers from a list of random numbers (up to 1000) using streams?
public class PrimeNumUsingStream {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,1,1,3,4,6);
	PrimeInterface prm=	ImplementPrime::isPrime;
		
		 List<Integer> list2 = list.stream().filter(e->prm.isPrime(e)).collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
}
