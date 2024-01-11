package com.cnstf.fourthweekList30_11_23;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
	int stuId;
	String stuName;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public StudentComparator(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	public StudentComparator() {
		super();
	}
	@Override
	public String toString() {
		return "StudentComparator [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		if(o1.getStuId()>o2.getStuId())
		{
			return 1;
		}
		else if(o1.getStuId()<o2.getStuId())
		{
			return -1;
		}
		else
		{
			return o1.stuName.compareTo(o2.stuName);
		}
		
	}
	
	

}
