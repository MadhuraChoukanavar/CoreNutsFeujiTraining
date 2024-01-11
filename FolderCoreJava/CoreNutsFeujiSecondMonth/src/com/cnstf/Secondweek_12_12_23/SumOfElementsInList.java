package com.cnstf.Secondweek_12_12_23;

import java.util.Arrays;
import java.util.List;

//7. Find the sum of all elements in the list. For example, if the input is 1,2,3,4,5, the output should be 15?

public class SumOfElementsInList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	
		int sum = list.stream().mapToInt(e->e.intValue()).sum();
		System.out.println(sum);
	}

}
