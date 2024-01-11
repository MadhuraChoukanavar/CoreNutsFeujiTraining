 package com.cnstf.firstweek_05_12_23;
//3. Write a program to get key and values at a time from HasMap.
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentAsKey {
	public static void main(String[] args) {
//		Map <Student,Student> map=new HashMap<>();
//		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
//		map.put(new Student("sahana",24, "banglore@1"),new Student("sahana",24, "banglore@1"));
//		map.put(new Student("madhura",24, "banglore@2"),new Student("madhura",24, "banglore@2"));
//		map.put(new Student("savita",24, "banglore@1"),new Student("savita",24, "banglore@1"));
//		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
//		Set<Student> keySet = map.keySet();
//		Iterator<Student> iterator = keySet.iterator();
//		while(iterator.hasNext())
//		{
//			Student key = iterator.next();
//			Student value = map.get(key);
//			System.out.println("key is = "+key+ " value is = "+value);
//		}
		Map<Employee, String> map=new HashMap<>();
		map.put(new Employee(1, "madhura", "123"), "madhura");
		map.put(new Employee(2, "sahana", "124"), "sahana");
		map.put(new Employee(3, "aparna", "125"), "aparna");
		map.put(new Employee(4, "savita", "126"), "savita");
		map.put(new Employee(5, "bassa", "127"), "bassa");
		
		Set<Employee> keySet = map.keySet();
		Iterator<Employee> iterator = keySet.iterator();
		while(iterator.hasNext())
		{
			Employee key=iterator.next();
			String value = map.get(key);
			System.out.println(key+" = "+value);
			
		}
		}

}
