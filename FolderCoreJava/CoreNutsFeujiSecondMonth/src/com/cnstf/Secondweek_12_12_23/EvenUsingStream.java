package com.cnstf.Secondweek_12_12_23;

 
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class EvenUsingStream {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,2,3,5,69);
		List<Integer> collectEven = list.stream().filter(e->(e%2==0)).collect(Collectors.toList());
		System.out.println("list of even number"+collectEven);
		List<Integer> collectOdd = list.stream().filter(e->(e%2!=0)).collect(Collectors.toList());
		System.out.println("list of odd numbers"+collectOdd);
	}

}
