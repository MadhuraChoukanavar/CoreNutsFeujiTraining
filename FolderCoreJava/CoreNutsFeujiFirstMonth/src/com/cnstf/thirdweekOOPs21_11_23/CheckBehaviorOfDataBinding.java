package com.cnstf.thirdweekOOPs21_11_23;

public class CheckBehaviorOfDataBinding {
	public static void main(String[] args) {
		Animal1 ani=new Animal1();
		System.out.println(ani.name);
		ani.eating();
		System.out.println(Animal1.age);
		Animal1 tig=new Tiger();
		System.out.println(tig.name);
		tig.eating();
		System.out.println(tig.age);
		//we can't store parent object in sub class reference
	//	Tiger tig1=new Animal1();
		
		
	}

}
