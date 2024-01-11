package com.cnstf.firstweek_08_12_23;

public class Employee {
	int eid;
	String eName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String eName) {
		super();
		this.eid = eid;
		this.eName = eName;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + "]";
	}
	
	Comparable<Student> comp=(Student stu)->
	{
		return this.eName.compareTo(stu.stuName);
	};
	

}
