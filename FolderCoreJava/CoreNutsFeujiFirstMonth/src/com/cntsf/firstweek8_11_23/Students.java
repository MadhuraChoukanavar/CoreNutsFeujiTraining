package com.cntsf.firstweek8_11_23;

public class Students {
	int studentId;
	String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	

}
