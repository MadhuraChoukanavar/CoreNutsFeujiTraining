package com.cnstf.Secondweek_12_12_23;

import java.util.ArrayList;
import java.util.List;

//2. Create a list of employees and print all records using streams?
public class StreamForEMployee {
	public static void main(String[] args) {
		List<Employee> list =new ArrayList<>();
		list.add(new Employee(01, "madhura", "laxmeshwar")); 
		list.add(new Employee(02, "sahana", "hubli")); 
		list.add(new Employee(03, "savita", "annigere")); 
		list.add(new Employee(04, "bassa", "yelvatti")); 
		list.add(new Employee(05, "aparna", "gadag")); 
		list.stream().forEach(e->System.out.println(e));
	}
}
