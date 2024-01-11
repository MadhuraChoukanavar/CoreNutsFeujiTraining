package com.cnstf.secondweek15_11_23;

public abstract class TestForAbstract {
	public int empId=10;
	public static void main(String[] args) {
		
		//we will get error when we try to create a object of abstract class 
		//bcoz it do not have complete implementation
	//	TestForAbstract abs=new TestForAbstract();`
		TestForAbstract test=new Test2();
	System.out.println(	test.empId);
	test.empId(12);
		
		
	}
	public abstract void empId(int id);

}
class Test2 extends TestForAbstract
{

	@Override
	public void empId(int id) {
		// TODO Auto-generated method stub
		
	}
	}
