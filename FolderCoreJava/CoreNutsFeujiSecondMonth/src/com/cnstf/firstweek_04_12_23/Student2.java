package com.cnstf.firstweek_04_12_23;

import java.util.Objects;

//3. Write a program to add duplicate Student elements to hashset 
//objects and display the unique Student elements as output?
public class Student2 implements Comparable<Student2> {
	int stuId;
	String stuName;

	public Student2(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	//@Override
//	public int hashCode() {
//		return Objects.hash(stuId);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student2 other = (Student2) obj;
//		return stuId == other.stuId ;
//	}
	@Override
	public int hashCode() {
		System.out.println( );
		return Objects.hash(stuId, stuName);
		
	}
	@Override
	public boolean equals(Object obj) {
		if  (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return stuId == other.stuId  ;
	}
	@Override
	public int compareTo(Student2 stu) {
		
		return this.stuName.compareTo( stu.getStuName(  ));
	}	
}
//Objects.equals(stuName, other.stuName)