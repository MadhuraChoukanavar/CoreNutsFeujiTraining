package com.cnstf.firstweek7_11_23;

import java.util.Scanner;

	//there are 
	//local,static and non static variables
	//local -->accessible only with in method and do not have any default values
	//static and non static--> accessible anywhere within class
	//static no need to create object and for not static we need to create objects

public class VariableAccessibilityPractice {
	

		public static void main(String[] args) {
			
		
			Scanner scn=new Scanner(System.in);
//			int studentId = scn.nextInt();
//			String studentName=scn.next();
//			String studentPhNo=scn.next();
//			String studentEmail=scn.next();
//			String studentCollage="SKSVMACET"; 
		Students student=new Students();
			student.setStudentNumber(101);
			student.setStudentName("madhura");
			student.setStudentPhNo("9449730745");
			student.setStudentEmail("choukanavarmadhura6@gmail.com");
			Students.setStudentCollage("SKSVMACET");
			displayStudentDetails(student);
		
		}
		
		public static void displayStudentDetails(Students student)
		{
			System.out.println(" Student Details ");
		
			System.out.println(student.getStudentNumber());
			System.out.println(student.getStudentName());
			System.out.println(student.getStudentPhNo());
			System.out.println(student.getStudentEmail());
			System.out.println(Students.getStudentCollage());
			
		}
}
