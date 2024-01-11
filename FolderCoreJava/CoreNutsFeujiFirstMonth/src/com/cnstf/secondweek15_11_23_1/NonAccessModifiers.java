package com.cnstf.secondweek15_11_23_1;

//we can use final for both variables and methods but abstract is used for methods only
public abstract class NonAccessModifiers {
	final int empId = 0;
	static final String empCompany = "";

	public static void main(String[] args) {
		final int empSal;
		empSal = 10;

	}

//	public abstract final void method1();
	//overloading we can over ride both final and abstract classes
	public abstract void method2();
	public abstract void method2(int a);

	public final void method3() {
		System.out.println("method3");
	}

	public final void method4(int a) {
		System.out.println("method4 with arrgument");
	}

	public final void method4() {
		System.out.println("method4 without arrgument");
	}

}
