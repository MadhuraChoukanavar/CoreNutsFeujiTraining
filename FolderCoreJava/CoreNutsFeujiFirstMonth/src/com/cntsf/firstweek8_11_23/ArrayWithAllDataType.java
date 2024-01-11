package com.cntsf.firstweek8_11_23;

public class ArrayWithAllDataType {
	public static void main(String[] args) {
		ArrayWithAllDataType arraydisplay = new ArrayWithAllDataType();
		arraydisplay.arrayWithByteDefault();
		arraydisplay.arrayWithIntDefault();
		arraydisplay.arrayWithFloatDefault();
		arraydisplay.arrayWithDoubleDefault();
		arraydisplay.arrayWithCharDefault();
		arraydisplay.arrayWithBooleanDefault();
		arraydisplay.arrayWithObjectsDefault();
		System.out.println("default values for byte");
		arraydisplay.arrayWithByteDefault1(5, 0);
	}

	public void arrayWithByteDefault() {
		byte[] byteValues = new byte[3];
		System.out.println("default values for byte");
		System.out.println(byteValues[0]);
		System.out.println(byteValues[1]);
		System.out.println(byteValues[2]);
		System.out.println();
	}

	public void arrayWithIntDefault() {
		int[] intValues = new int[3];
		System.out.println("default values for int");
		System.out.println(intValues[0]);
		System.out.println(intValues[1]);
		System.out.println(intValues[2]);
		System.out.println();
	}

	public void arrayWithFloatDefault() {
		float[] floatValues = new float[3];
		System.out.println("default values for float");
		System.out.print(floatValues[0]);
		System.out.print(floatValues[1]);
		System.out.print(floatValues[2]);
		System.out.println();
	}

	public void arrayWithDoubleDefault() {
		double[] doubleValues = new double[3];
		System.out.println("default values for double");
		System.out.println(doubleValues[0]);
		System.out.println(doubleValues[1]);
		System.out.println(doubleValues[2]);
		System.out.println();
	}

	public void arrayWithCharDefault() {
		char[] charValues = new char[3];
		System.out.println("default values for char");
		System.out.println(charValues[0]);
		System.out.println(charValues[1]);
		System.out.println(charValues[2]);
		System.out.println();
	}

	public void arrayWithBooleanDefault() {
		boolean[] BooleanValues = new boolean[3];
		System.out.println("default values for boolean");
		System.out.println(BooleanValues[0]);
		System.out.println(BooleanValues[1]);
		System.out.println(BooleanValues[2]);
		System.out.println();
	}

	public void arrayWithObjectsDefault() {
		Students[] students = new Students[2];
		System.out.println("default value for objects");
		students[0] = new Students();
		students[1] = new Students();
		System.out.println(students[0].getStudentId());
		System.out.println(students[0].getStudentName());
		// Students student2=new Students();
		System.out.println(students[1].getStudentId());
		System.out.println(students[1].getStudentName());
	}

	public void arrayWithByteDefault1(int lengthOfArray, int index) {
		byte[] byteValues = new byte[lengthOfArray];
		if (index < lengthOfArray) {
			System.out.println(byteValues[index]);
			arrayWithByteDefault1(lengthOfArray, ++index);
		} else {
			System.out.println();
			return;
		}
	}
}
