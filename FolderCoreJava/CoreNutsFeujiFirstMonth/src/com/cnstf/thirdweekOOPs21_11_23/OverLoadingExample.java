package com.cnstf.thirdweekOOPs21_11_23;

//3.overload function  in class and also show the advantage of using overloading concept
//advantage is if we want to perform same task in different way we will use overloading 
//example println will print int ,boolean string etc but no need to remember different method for printing different data
public class OverLoadingExample {
	public void method1() {
		System.out.println("method1 with no arrgument");
	}

	public int method1(int m) {
		System.out.println("method1 with int arrgument");
		return 0;

	}

	public boolean method1(boolean m) {
		System.out.println("method1 with boolean arrgument");
		return m;
	}

	public static void main(String[] args) {
		OverLoadingExample overload = new OverLoadingExample();
		overload.method1();

	}
}
