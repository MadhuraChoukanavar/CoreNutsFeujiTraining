package com.cnstf.Secondweek_12_12_23;

public class Employee {
	int empId;
	String eName;
	String eLocation;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int empId, String eName, String eLocation) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.eLocation = eLocation;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public String geteLocation() {
		return eLocation;
	}



	public void seteLocation(String eLocation) {
		this.eLocation = eLocation;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", eLocation=" + eLocation + "]";
	}
	
	
	
	
}
