package com.cnstf.thirdweek23_11_23;
//3.write a program which demonstrate and print them
public class ClassFOrConstroctorOverLoading {
	int num;
	String name;

	public static void main(String[] args) {
		ClassFOrConstroctorOverLoading cs = new ClassFOrConstroctorOverLoading();
		

	}

	public ClassFOrConstroctorOverLoading() {
		
		this(1);
		System.out.println("i m no arrgument constructor");
	}

	public ClassFOrConstroctorOverLoading(int num) {
		
		this(1,"madhura");
		System.out.println("i m one arrgument constructor");
		this.num = num;
	}

	public ClassFOrConstroctorOverLoading(int num, String name) {
		//this(1);
		
		System.out.println("i m two arrgument constructor");
		this.num = num;
		this.name = name;
	}
//	void m1(){
//		this.name="fhii";
//		
//	}
}
//note; we can have either this call or super call in one constructor
//we can't call constructor in constructor 
//we can't call constructor in method or block ex line 27
//