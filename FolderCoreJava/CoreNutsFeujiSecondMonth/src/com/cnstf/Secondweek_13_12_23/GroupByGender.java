package com.cnstf.Secondweek_13_12_23;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByGender {
	
	public static void main(String[] args) {
		List<Students> list =ListStudent.createList();
		list.stream().collect(Collectors.groupingBy((e)->e.getsGender())).entrySet().forEach((stu)->
				{
				System.out.println(stu.getKey()+"   "+stu.getValue().size());
				});
		
		
		list.stream().collect(Collectors.groupingBy((e)->e.getsDepartment())).
		entrySet().
		forEach((stu)->
		{
			System.out.println(stu.getKey());
			stu.getValue()
		.forEach((val)->
		{
			System.out.println(val.getSname());
		});
		});
		
	}

}