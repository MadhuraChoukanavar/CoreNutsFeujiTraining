package com.cnstf.thirdweekOOPs21_11_23;

import java.io.ObjectInputStream.GetField;

public class TestForPolymorphisum {
	public static void main(String[] args) {
		PolymorphisumAdvantage polyAdv=new PolymorphisumAdvantage();
		//Since the variable or data member we kept as private we can't access directly so we provide getter setter
//		polyAdv.empName="madhura";
//		polyAdv.empId=10;
		//hr age is not private so any body can access and change data
		polyAdv.empAge=23;
		
		polyAdv.setEmpId(10);
		System.out.println(polyAdv.getEmpId());
		polyAdv.setEmpName("madhua");
		System.out.println(polyAdv.getEmpName());
	}

}
