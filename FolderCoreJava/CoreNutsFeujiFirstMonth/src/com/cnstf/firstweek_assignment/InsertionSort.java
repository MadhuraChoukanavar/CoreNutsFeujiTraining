package com.cnstf.firstweek_assignment;

public class InsertionSort {
	public static void main(String[] args) {
		int [] a= {1,5,4,3,2};
		sort(a);
		for(int c:a)
		{
			System.out.println(c);
		}
	}
	public static void sort(int [] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}


}
