package com.cnstf.firstweek_05_12_23;

import java.util.Comparator;

public class Employee2 {
	int empId;
	String empName;
	String empLocation;
	
	
	
	public Employee2(int empId, String empName, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
	}
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + "]";
	}
//	@Override
//	public int compareTo(Employee2 emp) {
//		// TODO Auto-generated method stub
//		return this.empLocation.compareTo(empLocation);
//	}

	
	
	
}
