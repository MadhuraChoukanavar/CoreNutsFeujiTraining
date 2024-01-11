package com.cntsf.firstweek6_11_23;

public class TestStaticNonStaticBehaviourUsingConstructor {
	int employeeId;
	String employeeName;
	static String employeeCompany;

	public static void main(String[] args) {
		employeeCompany = "feuji";

		TestStaticNonStaticBehaviourUsingConstructor testCon1 = new TestStaticNonStaticBehaviourUsingConstructor(101,
				"Madhura");
		TestStaticNonStaticBehaviourUsingConstructor testCon2 = new TestStaticNonStaticBehaviourUsingConstructor(102,
				"joyti");
		TestStaticNonStaticBehaviourUsingConstructor testCon3 = new TestStaticNonStaticBehaviourUsingConstructor(103,
				"varsha");

		display(testCon1);
		display(testCon2);
		display(testCon3);
	}

	public TestStaticNonStaticBehaviourUsingConstructor(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public static void display(TestStaticNonStaticBehaviourUsingConstructor t) {
		System.out.println("emplyee id is " + t.employeeId + " employee name is " + t.employeeName + employeeCompany);

	}
}
