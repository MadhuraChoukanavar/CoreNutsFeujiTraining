package com.cntsf.firstweek8_11_23;

//adding elements of array without loop
public class SumOfElementsWithOutUsingLoop {
	public static void main(String[] args) {
		int[] arrayOfIntegers = { 1, 2, 4,5 };
		SumOfElementsWithOutUsingLoop sumOfElements = new SumOfElementsWithOutUsingLoop();
		System.out.println(sumOfElements.sumOfArray(arrayOfIntegers, 0, 0));

	}

	public int sumOfArray(int[] arrayOfInt, int index, int sum) {

		if (index < arrayOfInt.length) {
			return sum + arrayOfInt[index] + sumOfArray(arrayOfInt, ++index, sum);

		}
		return sum;

	}
}
