package com.cnstf.Secondweek_11_12_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//2. Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
public class SortUsingLamda {
	public static void main(String[] args) {
		
		List<Student> list =new ArrayList<>();
		list.add(new Student(01, "madhura", "blablabla"));
		list.add(new Student(02, "sahana", "blublu"));
		list.add(new Student(03, "savita", "bumbum"));
		list.add(new Student(04, "aparna", "kekekeke"));
		list.add(new Student(05, "bassa", "tototo "));
//		Comparator<Student> com=(Student s1,Student s2)->
//				{
//					return s1.getsName().compareTo(s2.getsName());
//			
//				};
		
		Comparator<Student> com=(Student s1,Student s2)->
		{
			return s1.getAddress().compareTo(s2.getAddress());
	
		};
				list.sort(com);
				for(Student s:list)
				{
					System.out.println(s);
				}
				
				
	}

}
