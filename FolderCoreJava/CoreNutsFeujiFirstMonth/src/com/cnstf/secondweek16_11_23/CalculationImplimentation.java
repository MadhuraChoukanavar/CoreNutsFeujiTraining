package com.cnstf.secondweek16_11_23;

public class CalculationImplimentation implements Calculation {

	@Override
	public int addition(int val1, int val2) {
		return val1+val2;
	}

	@Override
	public int multiplication(int val1, int val2) {
		return val1*val2;
	}

	@Override
	public int substraction(int val1, int val2) {
		return val1-val2;
	}

	@Override
	public double division(int val1, int val2) {
		return val1/val2;
	}
	

}
