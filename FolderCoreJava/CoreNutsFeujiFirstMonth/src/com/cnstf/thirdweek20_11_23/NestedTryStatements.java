package com.cnstf.thirdweek20_11_23;
//4.write program that implement the nested try statement
public class NestedTryStatements {
	 int number1;
	 String name=null;
	
	public static void main(String[] args) {
		NestedTryStatements nestedTry=new NestedTryStatements();
		nestedTry.methodForMultiTry(10,null);
		
	}
	public void methodForMultiTry(int i, String  name)
	{
		try
		{
			int result=i/0;
			try
			{
				System.out.println(name.charAt(i));
			}
			catch (Exception e) {
			System.out.println(i+"index is not there String pointing to null");
			}
			
			System.out.println(result);
			
				
	
		}
		catch (Exception e) {
			System.out.println(" number cant be divide by zero ");
		}
		
		
	}
}
