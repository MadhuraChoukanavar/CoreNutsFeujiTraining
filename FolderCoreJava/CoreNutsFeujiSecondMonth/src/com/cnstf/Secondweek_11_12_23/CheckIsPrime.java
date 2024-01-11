package com.cnstf.Secondweek_11_12_23;
//1. Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
import java.util.function.Function;


public class CheckIsPrime {
	public static void main(String[] args) {
		Function<Integer,Integer> pre=(val)->
		{
			int sum=0;
			for(int i=0;i<=val;i++)
			{
				if(i<=1)continue;
				 boolean flag=true;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0)flag=false;
					}
				if(flag==true)
				sum=sum+i;
			}
			return sum;
		};
		System.out.println(pre.apply(10));
	}
	
}
