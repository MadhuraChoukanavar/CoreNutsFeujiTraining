package com.cnstf.firstweek_assignment;

public class SearchingTechnic {
	public static void main(String[] args) {
		SearchingTechnic searc=new SearchingTechnic();
		int [] arryOfInt= {4,2,7,1,6};
		int [] arrayOfInt2= {2,5,6,8,9,12};
		System.out.println(searc.linerSearch(arryOfInt, 1));
		System.out.println(searc.BinerySearch(arrayOfInt2, 2, 0, arryOfInt.length));
	}
	public int linerSearch(int [] arrayOfInteger,int element)
	{
		for(int index=0;index<arrayOfInteger.length;index++)
		{
			if(arrayOfInteger[index]==element)
			{
				return index;
			}
		}
		return -1;
	}
	public int BinerySearch(int [] arrayOfInteger,int element,int first ,int last)
	{
	int midVal=arrayOfInteger.length/2;
	if(element==arrayOfInteger[midVal])return midVal;
	else if(element<arrayOfInteger[midVal])return last=midVal;
	else if(element>arrayOfInteger[midVal]) return first=midVal;
		return -1;
	}

}
