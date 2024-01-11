package com.cnstf.Secondweek_12_12_23;
//5. Find the maximum and minimum salary from the employee list using streams?

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinSal {
	
	public static void main(String[] args) {
		List<Employee1> list=new ArrayList<>();
		list.add(new Employee1(10, "xya", 1000));
		list.add(new Employee1(20,"pqr",200000));
		list.add(new Employee1(30, "mad", 500000));
		IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(Employee1::getEmpSal));
		System.out.println(collect.getMax());
		System.out.println(collect.getMin());
	}}
