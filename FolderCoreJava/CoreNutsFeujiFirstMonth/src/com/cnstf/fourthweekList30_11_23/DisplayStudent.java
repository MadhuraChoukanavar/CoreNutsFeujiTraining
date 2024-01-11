package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//5. Create a program to add Student elements to arraylist object and 
//display the elements using for loop and Iterator interface.

public class DisplayStudent {
	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(1, "sahana"));
		studentList.add(new Student(2, "madhura"));
		studentList.add(new Student(3, "aparna"));
		studentList.add(new Student(4, "savita"));
		
		DisplayStudent disStu=new DisplayStudent();
		disStu.displayStudents(studentList);
	}
	public void displayStudents(List<Student> studentList)
	{
		for(Student student:studentList)
		{
			System.out.println(student.toString());
			
		}
	}
	public void displayUsingIterator(List<Student> studentList)
	{
		Iterator<Student> iterator=studentList.iterator();
		while(iterator.hasNext())
		{
			System.out.println();
		}	}
}
