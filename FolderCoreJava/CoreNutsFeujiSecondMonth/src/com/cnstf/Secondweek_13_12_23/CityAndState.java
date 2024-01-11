package com.cnstf.Secondweek_13_12_23;

import java.util.List;
import java.util.stream.Collectors;

//6.Write a program to show State, City wise student count using streams?
public class CityAndState {
	public static void main(String[] args) {
		List<Students> list = ListStudent.createList();
		list.stream().collect(Collectors.groupingBy((e)->e.getState())).entrySet().
		forEach((e)->
		{
			System.out.println("state "+e.getKey());
			e.getValue().stream().collect(Collectors.groupingBy(Students::getsCity)).entrySet().
			forEach((f)->
			{
				System.out.println("city = "+f.getKey()+" "+f.getValue().size());
				
			});
			});
	}

}
