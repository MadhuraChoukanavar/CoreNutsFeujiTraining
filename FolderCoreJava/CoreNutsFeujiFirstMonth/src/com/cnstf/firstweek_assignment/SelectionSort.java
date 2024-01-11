package com.cnstf.firstweek_assignment;

public class SelectionSort {
	public static void main(String[] args) {
		int [] a= {1,5,6,3,4,7,8,9,2};
		sort(a);
		for(int c:a)
		{
			System.out.println(c);
		}
	}
		public static void sort(int [] a)
		{
			for(int i=0;i<a.length-1;i++)
			{
				int index=i;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[index]>a[j])index=j;
				}
				if(i!=index)
				{
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				}
			}
		}
			
		

}
