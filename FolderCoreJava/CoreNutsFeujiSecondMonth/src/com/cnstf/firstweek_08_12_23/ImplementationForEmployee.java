package com.cnstf.firstweek_08_12_23;

import java.util.Set;
import java.util.TreeSet;

public class ImplementationForEmployee {
	public static void main(String[] args) {
		
		
		Set<Employee> set=new TreeSet<>();
		set.add(new Employee(10, "madhura"));
		set.add(new Employee(50, "sahana"));
		set.add(new Employee(30, "aparna"));
		set.add(new Employee(20, "savita"));
		
		System.out.println(set);
	}

}
