package com.cnstf.Secondweek_13_12_23;

import java.util.List;
import java.util.stream.Collectors;

public class PrintStudentList {
	static List<Students>  list=ListStudent.createList();
	
	
	public static void main(String[] args) {
		
		List<String> collect = list.stream().map(e->e.getSname()).collect(Collectors.toList());
		System.out.println(collect);
		
		list.stream().filter((e)->e.getsGender().equalsIgnoreCase("male")).
		collect(Collectors.toList()).forEach((e)->System.out.println(e.getSname()));
		
		
		list.stream().map()
	}}



