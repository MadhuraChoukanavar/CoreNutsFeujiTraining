package com.cnstf.firstweek_05_12_23;

import java.util.Objects;

public class Employeee {
	int empId;
	String empName;
	String empGender;
	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeee(int empId, String empName, String empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
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
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "Employeee [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empGender, empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		return Objects.equals(empGender, other.empGender) && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}
	

}
