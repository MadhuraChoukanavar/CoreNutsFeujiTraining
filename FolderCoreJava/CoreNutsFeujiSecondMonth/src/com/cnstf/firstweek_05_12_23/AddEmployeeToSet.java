package com.cnstf.firstweek_05_12_23;

import java.util.HashSet;
import java.util.Set;

import com.cnstf.firstweek_04_12_23.Student2;

public class AddEmployeeToSet {
	public static void main(String[] args) {
		Set<Employeee> empSet=new HashSet<>();
		empSet.add(new Employeee(10, "madhura", "laxmeshwar"));
		empSet.add(new Employeee(11, "madhura", "laxmeshwar"));
		empSet.add(new Employeee(12, "sahana", "hubli"));
		empSet.add(new Employeee(10, "madhura", "laxmeshwar"));
		empSet.add(new Employeee(13, "aparna", "gadag"));
		empSet.add(new Employeee(10, "madhura", "laxmeshwar"));
		empSet.add(new Employeee(10, "madhura", "laxmeshwar"));
		empSet.add(new Employeee(13, "aparna", "gadag"));
		
		System.out.println(empSet);
	}

}
