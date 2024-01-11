package com.cnstf.firstweek_06_12_23;

import java.util.Collection;
import java.util.Objects;

public class EmployeeDetails {
	
	String empName;
	String deptType;
	String location;
	
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeDetails(String empName, String deptType, String location) {
		super();
		this.empName = empName;
		this.deptType = deptType;
		this.location = location;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDeptType() {
		return deptType;
	}


	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}



public String getLocation()
{
	return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "EmployeeDetails [empName=" + empName + ", deptType=" + deptType + ", location=" + location + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(deptType, empName, location);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		return Objects.equals(deptType, other.deptType) && Objects.equals(empName, other.empName)
				&& Objects.equals(location, other.location);
	}
	
	

}
