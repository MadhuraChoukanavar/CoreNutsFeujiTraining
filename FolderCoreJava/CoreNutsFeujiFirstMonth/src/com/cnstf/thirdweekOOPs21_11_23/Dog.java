package com.cnstf.thirdweekOOPs21_11_23;
// we can access the parent class 
public class Dog extends Animal {
	
	@Override
	public void eating(String name,int lifeSpan)
	{
		super.name="Dog";
		System.out.println(super.name);
		super.lifeSpan=10;
		System.out.println(super.lifeSpan);
		System.out.println();
		
		System.out.println("dog will have veg and non veg");
		
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eating(null, 0);
		System.out.println(a.lifeSpan);
		System.out.println(a.name);
		Animal a1=new Animal();
		a1.eating(null, 0);
		System.out.println(a1.lifeSpan);
		System.out.println(a1.name);
		
//		
//		Animal a=new Dog();
//		a.m1(0);
//		a.m1();
	}
//	
//	public void m1()
//	{
//		System.out.println("m1");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void eat(String veg ) {
//		
//	}

}
