package com.cnstf.Secondweek_12_12_23;
//4. Create a new list of employees.Find whose salary is greater than 10000 from the list of employee records?

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class EmployeeGreaterSal {
	public static void main(String[] args) {
		
	
	
	List<Employee1> list=new ArrayList<>();
	list.add(new Employee1(10, "xya", 1000));
	list.add(new Employee1(20,"pqr",200000));
	list.add(new Employee1(30, "mad", 500000));
	List<Employee1> collect = list.stream().filter(e->e.getEmpSal()>10000).collect(Collectors.toList());
	collect.stream().forEach((e)->System.out.println(e));
	}

}
