 package com.cnstf.firstweek_04_12_23;



//Write a program to find the count of each word in a given String value.
//String str = "Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts 
//technologies in Bangalore";
//Expected output is:
//  Core - 4
//  nuts - 4
//  technologies - 4
//  located - 2
//  in - 4
//  Bangalore - 2
//  Hyderabad - 1
//  hyderabad - 1
 
public class CountOfEachString {
	public static void main(String[] args) {
		String str="Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts echnologies in Bangalore";
	String[] strArray=str.split(" ");
	for(int i=0;i<strArray.length-1;i++)
	{
		int count=1;
		boolean flag=false;
		for(int j=i+1;j<strArray.length;j++)
		{
			
			if(strArray[i]!=""&&strArray[i].equalsIgnoreCase(strArray[j]))
			{
				count++;
				strArray[j]="";
				flag=true;
			}
		}
		if(flag) {
		System.out.println(strArray[i]+" = "+count);
		}
	}
	}

}
