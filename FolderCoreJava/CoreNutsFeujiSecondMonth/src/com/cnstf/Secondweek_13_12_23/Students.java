package com.cnstf.Secondweek_13_12_23;

public class Students {
	int sid;
	String sname;
	String sGender;
	 String sDepartment;
	 String sAddress;
	 String sCity;
	 String State;
	//Create a new Student Pojo Class with following attributes: Id,Name,Gender,Department, address, City, State.
	 
	 public Students() {
			super();
			// TODO Auto-generated constructor stub
		}
	 
	 
	 
	public Students(int sid, String sname, String sGender, String sDepartment, String sAddress, String sCity,
			String state) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sGender = sGender;
		this.sDepartment = sDepartment;
		this.sAddress = sAddress;
		this.sCity = sCity;
		State = state;
	}



	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public String getsDepartment() {
		return sDepartment;
	}
	public void setsDepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}



	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", sGender=" + sGender + ", sDepartment=" + sDepartment
				+ ", sAddress=" + sAddress + ", sCity=" + sCity + ", State=" + State + "]";
	}
	
	
	
	

}
