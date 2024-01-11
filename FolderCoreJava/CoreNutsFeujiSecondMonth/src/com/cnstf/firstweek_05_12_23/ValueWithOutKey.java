package com.cnstf.firstweek_05_12_23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//2. Write a program to get values from HashMap without using keys.
public class ValueWithOutKey {
	public void getWithOutKey()
	{
		Map<Integer,Employee> map=new HashMap<>();
		map.put(new Employee(10, "madhura", "567878").getEmpId(), new Employee(10, "madhura", "567878"));
		map.put(new Employee(20, "sahana", "567878").getEmpId(), new Employee(20, "sahana", "567878"));
		map.put(new Employee(50, "pravalika", "567878").getEmpId(), new Employee(50, "pravalika", "567878"));
		map.put(new Employee(50, "madhura", "567878").getEmpId(), new Employee(50, "madhura", "567878"));
	
		map.put( new Employee(30, "pravalika", "567878").getEmpId(), new Employee(30, "pravalika", "567878"));
		
		Collection<Employee> values = map.values();
		Iterator<Employee> iterator = values.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		ValueWithOutKey val=new ValueWithOutKey();
		val.getWithOutKey();
	}
}
