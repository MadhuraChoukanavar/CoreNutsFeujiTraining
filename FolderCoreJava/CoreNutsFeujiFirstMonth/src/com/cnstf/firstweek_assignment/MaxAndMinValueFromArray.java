package com.cnstf.firstweek_assignment;

public class MaxAndMinValueFromArray {
	public static void main(String[] args) {
		MaxAndMinValueFromArray maxMin=new MaxAndMinValueFromArray();
		int[] arrayOfNumber= {1,8,6,5,6,3};
		System.out.println(maxMin.MaxValue(arrayOfNumber));
	System.out.println(maxMin.MinValue(arrayOfNumber));
		
	}
	public int MaxValue(int[] intArray)
	{
		int index=0;
		int maxVal=intArray[index];
	
		while(index<intArray.length)
		{
			if(intArray[index++]>maxVal)
			{
				maxVal=intArray[index];
			}
		}
		return maxVal;
		
	}
	
	
	public int MinValue(int[] intArray)
	{
		int index=0;
		int minVal=intArray[index];
		
		while(index<intArray.length)
		{
			if(intArray[index++]<minVal)
			{
				minVal=intArray[index];
			}
		}
		return minVal;
		
		
	}

}
