package com.cnstf.firstweek_04_12_23;

import java.util.ArrayList;
import java.util.List;

//10. Write a program to add all elements of a list to array List and
//get sub list from a List?
public class AddListToArray {
	public static void main(String[] args) {
		
		try {
		List<String> arrayList=new ArrayList<>();
		arrayList.add("string1");
		arrayList.add("string2");
		arrayList.add("string3");
		arrayList.add("string4");
		arrayList.add("string5");
		arrayList.add("string6");
		arrayList.add("string7");
		arrayList.add("string8");
		arrayList.add("string9");
		arrayList.add("string10");
		
		List<String> subList1=arrayList.subList(1, 3);
		System.out.println(subList1);
		List<String> subList2=arrayList.subList(4, 8);
		System.out.println(subList2);
		List<String> subList3=arrayList.subList(1, 15);
		System.out.println(subList3);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
