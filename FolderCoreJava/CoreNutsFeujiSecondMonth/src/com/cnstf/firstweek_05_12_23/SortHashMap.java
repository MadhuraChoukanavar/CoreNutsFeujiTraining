package com.cnstf.firstweek_05_12_23;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

import java.util.TreeSet;

// 7. Write program sort the Employee elements (keys) based on name or location from HashMap
public class SortHashMap {
	public static void main(String[] args) {
		SortHashMap sortMap=new SortHashMap();
		Map<Employee3, Employee3> map=new HashMap<>();
		sortMap.sortmap(map);
		Set<Employee3> keySet = map.keySet();
		Set<Employee3> treeset=new TreeSet<>(keySet);
		for(Employee3 e:treeset)
		{
			System.out.println(e);
		}
		
	
		
	}
	 void sortmap(Map<Employee3, Employee3> map) {
			map.put(new Employee3(10, "madhura", "banglore"),new Employee3(10, "madhura", "banglore"));
			map.put(new Employee3(20, "sahana", "mysore"),new Employee3(20, "sahana", "mysore"));
			map.put(new Employee3(30, "aparna", "gadag"),new Employee3(30, "aparna", "gadag"));
			map.put(new Employee3(40, "savita", "hubli"),new Employee3(40, "savita", "hubli"));
			map.put(new Employee3(50, "chetana", "laxmeshwar"),new Employee3(50, "chetana", "laxmeshwar"));
			
	}
	
}
