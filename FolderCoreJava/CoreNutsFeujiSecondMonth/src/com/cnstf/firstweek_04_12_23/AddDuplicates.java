package com.cnstf.firstweek_04_12_23;

import java.util.HashSet;

//2. Write a program to add duplicate elements to a hashset
//object and confirm what exception will throw?
//it won't throw any exception if we add duplicates
public class AddDuplicates {
	public static void main(String[] args) {
		HashSet<Student > set=new HashSet<>();
		set.add(new Student(01,"sahana"));
		set.add(new Student(02,"Madhura"));
		set.add(new Student(01,"sahana"));
		set.add(new Student(03,"Aparna"));
		set.add(new Student(04,"Savita"));
		set.add(new Student(05,"Chetana"));
		System.out.println(set.toString());
		
	}

}
