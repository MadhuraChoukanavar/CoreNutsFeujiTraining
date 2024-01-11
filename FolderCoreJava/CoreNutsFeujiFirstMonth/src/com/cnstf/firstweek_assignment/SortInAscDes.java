package com.cnstf.firstweek_assignment;

import java.util.concurrent.ArrayBlockingQueue;

public class SortInAscDes {
	public static void main(String[] args) {
		int [] arrayOfInt= {2,5,3,1,7,9,2,4};
		SortInAscDes ascDes=new SortInAscDes();
		ascDes.ascendingOrder(arrayOfInt);
		System.out.print("elements in assending order  : ");
		for(int elements:arrayOfInt)
		{
			System.out.print(+elements+",");
		}
		System.out.println();
		ascDes.desendingOrder(arrayOfInt);
		System.out.print("elements in descinding order  :  ");
		for(int elements:arrayOfInt)
		{
			System.out.print(+elements+",");
		}
	}
	
	

	public void ascendingOrder(int[] arrayOfInt)
{
	for(int index=0;index<arrayOfInt.length-1;index++)
	{
		for(int index1=0;index1<arrayOfInt.length-1-index;index1++)
		{
			if(arrayOfInt[index1]>arrayOfInt[index1+1])
			{
				int temp=arrayOfInt[index1];
				arrayOfInt[index1]=arrayOfInt[index1+1];
				arrayOfInt[index1+1]=temp;
			}
		}
	}
}
	public void desendingOrder(int[] arrayOfInt)
	{
		for(int index=0;index<arrayOfInt.length-1;index++)
		{
			for(int index1=0;index1<arrayOfInt.length-1-index;index1++)
			{
				if(arrayOfInt[index1]<arrayOfInt[index1+1])
				{
					int temp=arrayOfInt[index1];
					arrayOfInt[index1]=arrayOfInt[index1+1];
					arrayOfInt[index1+1]=temp;
				}
			}
		}
	}
		}
