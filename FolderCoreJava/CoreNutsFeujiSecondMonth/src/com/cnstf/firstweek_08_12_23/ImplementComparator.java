package com.cnstf.firstweek_08_12_23;

import java.util.Comparator;

import java.util.Set;

import java.util.TreeSet;

public class ImplementComparator {
	public static void main(String[] args) {

		Comparator<Student> comp = (Student stu1, Student stu2) -> {
			return stu1.getStuName().compareTo(stu2.getStuName());
		};

		Set<Student> stu = new TreeSet<Student>(comp);
		stu.add(new Student(01, "madhura"));
		stu.add(new Student(02, "sahana"));
		stu.add(new Student(03, "chetana"));
		stu.add(new Student(04, "aparna"));

		System.out.println(stu);

	}

}
