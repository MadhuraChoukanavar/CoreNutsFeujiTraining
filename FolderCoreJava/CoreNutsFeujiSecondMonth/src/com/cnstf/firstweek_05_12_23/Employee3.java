package com.cnstf.firstweek_05_12_23;

import java.util.Objects;

public class Employee3 implements Comparable<Employee3> {
	int empId;
	String empName;
	String empLocation;
	
	
	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee3(int empId, String empName, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
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
		return "Employee3 [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empLocation, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee3 other = (Employee3) obj;
		return empId == other.empId && Objects.equals(empLocation, other.empLocation)
				&& Objects.equals(empName, other.empName);
	}
	@Override
	public int compareTo(Employee3 o) {
		// TODO Auto-generated method stub
		return this.empLocation.compareTo(o.empLocation);
	}
	

}
