package com.cnstf.firstweek_04_12_23;
//4. Write a program to add primitive data type elements (duplicates) 

//to a set object and display the elements in Sort order?
import java.util.Set;
import java.util.TreeSet;

public class PrimitiveInSortedOrder {
	public static void main(String[] args) {
		Set set1=new TreeSet();	
		set1.add(10);
		set1.add(25);
		set1.add(30);
		set1.add(20);
		set1.add(99);
		set1.add(99);
		System.out.println(set1);
	}

}
