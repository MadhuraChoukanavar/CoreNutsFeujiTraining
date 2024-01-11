package com.cnstf.firstweek_04_12_23;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//6. Write a program to show the difference between HashSet and TreeSet?
public class DiffHashTreeSet {
	public static void main(String[] args) {
		Set<String> treeSet=new TreeSet<String>();
		treeSet.add("madhura");
		treeSet.add("sahana");
		treeSet.add("madhura");
		treeSet.add("sahana");
		treeSet.add("aparna");
		treeSet.add("madhura");
		treeSet.add("savita");
		System.out.println(treeSet);
		
		
		
		Set<String> stringSet=new HashSet<>();
		stringSet.add("madhura");
		stringSet.add("sahana");
		stringSet.add("madhura");
		stringSet.add("sahana");
		stringSet.add("aparna");
		stringSet.add("madhura");
		stringSet.add("savita");
		System.out.println(stringSet);
	}

}
