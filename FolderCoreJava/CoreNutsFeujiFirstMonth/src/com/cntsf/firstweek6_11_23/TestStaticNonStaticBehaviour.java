package com.cntsf.firstweek6_11_23;

public class TestStaticNonStaticBehaviour {
	int EmployeeNumber = 101;
	String EmployeeName = "madhura";

	static String EmployeeCompany = "Feuji";

	public static void main(String[] args) {
		TestStaticNonStaticBehaviour Emp1 = new TestStaticNonStaticBehaviour();
		System.out.println("employee id is " + Emp1.EmployeeNumber + " employee name is " + Emp1.EmployeeName
				+ " employee working in " + EmployeeCompany);

	}

}
