package com.cnstf.firstweek_05_12_23;

import java.util.Objects;

public class Student implements Comparable<Student>{
//	int stuId;
	String stuName;
	int stuAge;
	String Address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String stuName, int stuAge, String address) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		Address = address;
	}

	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge + ", Address=" + Address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, stuAge, stuName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Address, other.Address) && stuAge == other.stuAge
				&& Objects.equals(stuName, other.stuName);
	}

	@Override
	public int compareTo(Student stu) {
		// TODO Auto-generated method stub
		return this.stuName.compareTo(stu.getStuName());
	}
	
	
	
	

}
