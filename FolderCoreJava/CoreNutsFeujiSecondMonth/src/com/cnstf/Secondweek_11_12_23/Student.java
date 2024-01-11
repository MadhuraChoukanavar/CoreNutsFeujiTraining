package com.cnstf.Secondweek_11_12_23;

public class Student {
	int sid;
	String sName;
	String address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String sName, String address) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.address = address;
	}
	


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", address=" + address + "]";
	}
	
	

}
