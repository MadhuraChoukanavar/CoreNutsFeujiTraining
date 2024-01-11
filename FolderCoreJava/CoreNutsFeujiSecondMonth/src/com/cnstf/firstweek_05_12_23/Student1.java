package com.cnstf.firstweek_05_12_23;

import java.util.Objects;

public class Student1 {
	String name;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student1(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(gender);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(gender, other.gender);
	}
	

}
