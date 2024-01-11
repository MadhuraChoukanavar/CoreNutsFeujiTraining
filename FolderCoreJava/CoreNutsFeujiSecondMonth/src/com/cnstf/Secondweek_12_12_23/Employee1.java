package com.cnstf.Secondweek_12_12_23;

public class Employee1 {
	int empId;
	String empName;
	int empSal;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int empId, String empName, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}
