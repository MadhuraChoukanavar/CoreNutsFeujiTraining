package com.cnstf.firstweek_04_12_23;

import java.util.HashSet;
import java.util.Set;

//1. Write a program to add primitive data type elements  to a hashset 
//object and display the elements? 


//-->hash set will print in random order and remove duplicats

public class AddPrimitiveToHashSet {
	public static void main(String[] args) {
		Set set=new HashSet<>();
		set.add(10);
		set.add(25);
		set.add(85);
		set.add(25);
		set.add(15);
		set.add(25);
		System.out.println(set.toString());
	}

}
