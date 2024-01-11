package com.cnstf.firstweek7_11_23;

public class Students {

	int studentId;
	String studentName;
	String studentPhNo;
	String studentEmail;
	static String studentCollage;
	public int getStudentNumber() {
		return studentId;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentId = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhNo() {
		return studentPhNo;
	}
	public void setStudentPhNo(String studentPhNo) {
		this.studentPhNo = studentPhNo;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public static String getStudentCollage() {
		return studentCollage;
	}
	public static void setStudentCollage(String studentCollage) {
		Students.studentCollage = studentCollage;
	}
}
