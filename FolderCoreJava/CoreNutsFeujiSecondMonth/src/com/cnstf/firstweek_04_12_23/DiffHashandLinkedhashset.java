package com.cnstf.firstweek_04_12_23;
//7. Write a program to show the difference between HashSet and LinkedHashSet
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DiffHashandLinkedhashset {
	public static void main(String[] args) {
		
		Set<String> stringSet=new HashSet<>();
		stringSet.add("madhura");
		stringSet.add("sahana");
		stringSet.add("madhura");
		stringSet.add("sahana");
		stringSet.add("aparna");
		stringSet.add("madhura");
		stringSet.add("savita");
		System.out.println("............output hashmap..............");
		System.out.println(stringSet);
		

		Set<String> stringLinkedSet=new LinkedHashSet<>();
		stringLinkedSet.add("madhura");
		stringLinkedSet.add("sahana");
		stringLinkedSet.add("madhura");
		stringLinkedSet.add("sahana");
		stringLinkedSet.add("aparna");
		stringLinkedSet.add("madhura");
		stringLinkedSet.add("savita");
		System.out.println("............output of linkedhashmap..............");
		System.out.println(stringLinkedSet);
	}

}
