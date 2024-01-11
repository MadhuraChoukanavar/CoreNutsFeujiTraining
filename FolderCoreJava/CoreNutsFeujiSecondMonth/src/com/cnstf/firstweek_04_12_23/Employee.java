package com.cnstf.firstweek_04_12_23;

public class Employee  implements Comparable<Employee>{
	int empId;
	String empName;
	String empNum;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empNum) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNum = empNum;
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
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empNum=" + empNum + "]";
	}
	@Override
	public int compareTo(Employee obj) {
		
		return this.empId-obj.empId;
	}

}
