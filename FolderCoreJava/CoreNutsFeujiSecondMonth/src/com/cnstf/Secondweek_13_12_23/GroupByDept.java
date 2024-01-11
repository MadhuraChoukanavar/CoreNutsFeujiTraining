package com.cnstf.Secondweek_13_12_23;

import java.util.List;

import java.util.stream.Collectors;
//4.Names of the students categorized by department using streams?
public class GroupByDept {
public static void main(String[] args) {
	List<Students> list = ListStudent.createList();
	list.stream().collect(Collectors.groupingBy(Students::getsDepartment)).entrySet().forEach((e)->{
	System.out.println(e.getKey());e.getValue().forEach((value)->
	{
		System.out.println(value.getSname());
	});
	});
	System.out.println("cse");
	list.stream().filter((e)->e.getsDepartment().equalsIgnoreCase("cse")).collect(Collectors.toList()).
	forEach((val)->System.out.println(val.getSname()));	
	   

	list.stream().collect(Collectors.groupingBy((e)->e.getsDepartment())).entrySet()
	.forEach((val)->{
		val.getValue().stream().collect(Collectors.groupingBy((e)->e.getsGender()
		).en);
		
	});

//	list.stream().collect(Collectors.groupingBy(Student::getDept)).entrySet().forEach((e)->{
//		System.out.println("Dept: "+e.getKey()+" Names: ");
//		e.getValue().forEach((value)->{	
//
//			System.out.println("                "+value.getName());
//		});
//	});
}
}
