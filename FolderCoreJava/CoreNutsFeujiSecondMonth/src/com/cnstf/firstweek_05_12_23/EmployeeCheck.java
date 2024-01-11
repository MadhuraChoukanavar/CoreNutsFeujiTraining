package com.cnstf.firstweek_05_12_23;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;


public class EmployeeCheck {
	//Scanner scn=new Scanner(System.in);
	public long empCheck(String next)
	{
		
		List<EmployeeList> employee=new GetEmployeeList().employeeList();
	//System.out.println("enter the name of employee");
//	String next = scn.next();
	
	long count = employee.stream().filter((emp)->emp.getName().equalsIgnoreCase(next)).count();
	System.out.println(count);
	if(count>0)
	{
		return 1;
		
	}
	else
	{
		return 0;
	}
	
	}

}
