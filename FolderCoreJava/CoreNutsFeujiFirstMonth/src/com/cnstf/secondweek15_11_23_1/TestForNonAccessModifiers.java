package com.cnstf.secondweek15_11_23_1;

public abstract class TestForNonAccessModifiers extends NonAccessModifiers {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
//if we cant override the abstract method in child class even child class will become abstract
	@Override
	public abstract void method2(int a) ;
	
	//we cant override final methods but a subclass must over ride all abstract method from super class
//	public void method4(int a) {
//		
//	}
		
}
