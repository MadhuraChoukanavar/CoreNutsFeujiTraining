package com.cnstf.firstweek_assignment;

public class BubbleSort {
	public static void main(String[] args) {
		int [] a= {1,5,3,8,6,4,5};
		sort(a);
		for(int s:a)
		{
			System.out.println(s);
		}

}
	public static void sort(int [] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
	}

}
