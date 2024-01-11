package com.cnstf.Secondweek_13_12_23;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//3.Write a program to list students who come under the CSE department using streams?

public class CseStudents {
public static void main(String[] args) {
	List<Students> list = ListStudent.createList();
	  Stream<Entry<String, List<Students>>> filter = list.stream().collect(Collectors.groupingBy((e)->e.getsDepartment()))
			  .entrySet().stream().filter((e)->
	{
	return e.getKey().equalsIgnoreCase("cse");
	});

	filter.forEach((e)->System.out.println(e.getValue()));
	
	
	//or
	
	List<Students> list2=	list.stream().filter((e)->e.getsDepartment().equalsIgnoreCase("CSE")).toList();
	System.out.println(list2);
	
	list.stream().collect(Collectors.groupingBy((e)->e.getsDepartment())).entrySet()
	.forEach((stu)->
	{
	System.out.println(stu.getKey());stu.getValue().forEach((val)->{
		System.out.println(val.getSname());
		
	});
	});
	System.out.println("mech girls");
	list.stream().collect(Collectors.groupingBy((e)->e.getsDepartment())).entrySet()
	.forEach((k)->
	{
		if(k.getKey().equalsIgnoreCase("mech"))
		{
			k.getValue().forEach((val)->
			{
				if(val.getsGender().equalsIgnoreCase("female"))
				{
					System.out.println(k.getKey()+" "+val.getSname());
				}
			});
		}
	
	});
}
}
