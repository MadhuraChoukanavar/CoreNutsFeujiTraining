package com.cnstf.Secondweek_12_12_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//6. Add 5 to each element in the integer list. For example, 
//if the input is 1,2,3,4,5, the output should be 6,7,8,9,10?
public class Add5ToElements {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		list.forEach((e)->System.out.println(e+5));
	}

}
