package com.cnstf.firstweek_04_12_23;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//note:
//set allow null value once if comparing the string value to insert
//if we add twice it will throw nullpointer Exception
//if we can add null values if we are comparing wit only id but not witt name
public class AddStudent2ToSet {
	public static void main(String[] args) {
		Set<Student2> set=new HashSet<>();
//		Set<Integer> setInt=new HashSet<>();
//		setInt.add(null);
//		System.out.println(setInt);
		

		set.add(new Student2(01,"Sahana"));
		set.add(new Student2(02,"Madhura"));
		set.add(new Student2(01,"sahana"));
		set.add(new Student2(01,"sahana"));
		set.add(new Student2(01,"sahana"));
		set.add(new Student2(03,"Aparna"));
		set.add(new Student2(04,"Savita"));
		set.add(new Student2(05,"Chetana"));
		set.add(new Student2(0, null));
		set.add(new Student2(0, null));
		set.add(new Student2(4, null));
		set.add(new Student2(0, null));
		//set.add(new Student2(06, null));
		System.out.println(set.toString());
	}

}
