package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testcomparatoe {
	public static void main(String[] args) {
		
	
	List<StudentComparator> list=new ArrayList<>();
	list.add(new StudentComparator(5,"sahana"));
	list.add(new StudentComparator(10,"madhura"));
	list.add(new StudentComparator(11,"aparna"));
	list.add(new StudentComparator(13,"sahana"));
	Collections.sort(list, new StudentComparator());
	for(StudentComparator stu: list)
	{
		System.out.println(stu);
	}
	
	
	}
}
