package com.cnstf.secondweek16_11_23;

public class TestForHumanAbstractiom {
	public static void main(String[] args) {
		HumanAbstract madhura=new Madhura();
		System.out.println(madhura.name="madhura");
		madhura.speak();
		madhura.eating();
		madhura.employeeMent();
		HumanAbstract sahana =new Sahana();
		sahana.eating();
		sahana.employeeMent();
		sahana.speak();
	}

}
