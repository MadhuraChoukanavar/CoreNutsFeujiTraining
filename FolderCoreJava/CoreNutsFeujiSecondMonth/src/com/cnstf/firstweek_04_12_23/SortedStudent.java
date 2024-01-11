package com.cnstf.firstweek_04_12_23;

import java.util.Set;
import java.util.TreeSet;

//5. Write a program to add Student elements (duplicate) to set objects 
// and display the elements in Sort order?
public class SortedStudent {
	public static void main(String[] args) {
		Set <Student2> set=new TreeSet<>();
		set.add(new Student2(10, "madhura"));
		set.add(new Student2(12, "sahana"));
		set.add(new Student2(13,"aparna"));
		System.out.println(set);
	}

}
