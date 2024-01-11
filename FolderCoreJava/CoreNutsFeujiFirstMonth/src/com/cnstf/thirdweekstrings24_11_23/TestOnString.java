package com.cnstf.thirdweekstrings24_11_23;

//2. Write a program to get substring “CoreNuts Technologies“ from “CoreNuts Technologies Pvt ltd.”;
//3. Write a program to compare address of string objects
//4. Write a program to compare string values instead of address of string objects
//5. Write a program to reverse a string “CoreNuts Technologies Pvt ltd.” in different ways (on only string object)
//6. Write a program to reverse words instead of characters ““CoreNuts Technologies Pvt ltd.”
//7. Write a program to split a string and display tokenized strings
//8. Write a program using StringBuffer class to delete a String “Technologies” from “CoreNuts Technologies Pvt ltd.”
//9. Write a program using StringBuffer class to insert a String “Technologies” after CoreNuts in “CoreNuts Pvt ltd.”
public class TestOnString {
	public static void main(String[] args) {
		TestOnString test = new TestOnString();
		test.SubString("CoreNuts Technologies Pvt ltd.");
		//since string is created without new it will point same String
		test.comp("animal", "animal");
		//since string is created without new it will point different String
		test.comp(new String ("animal"), new String ("animal"));
		test.compVal(new String ("animal"), new String ("animal"));
		test.rev("CoreNuts Technologies Pvt ltd.");
		test.splitStr("CoreNuts Technologies Pvt ltd.");
		test.StringBuf(new StringBuffer("CoreNuts Technologies Pvt ltd."));
		test.insertStr(new StringBuffer("CoreNuts Pvt ltd."));
	}
//2.
	public void SubString(String s1)

	{
		System.out.println(s1.substring(0, 21));
	}
//3.	
	public void comp(String s1, String s2) {
		System.out.println(s1==s2);
	}
//4.
	public void compVal(String s1,String s2)
	{
		System.out.println(s1.equals(s2));
	}
//5.
	public void rev(String s)
	{
		char [] arrayOfChar=s.toCharArray();
		String s2="";
		for(int index=arrayOfChar.length-1;index>=0;index--)
		{
			s2=s2+arrayOfChar[index];
			
		}
		System.out.println(s2);
	}
//7.
	public void splitStr(String s)
	{
		String str="";
		String [] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			str=str+s1[i];
		}
	}
//.8	
	public void StringBuf(StringBuffer strbff)
	{
		System.out.println(strbff.delete(9, 21));
	}
	//9.
	public void insertStr(StringBuffer sb)
	{
		sb.insert(9, "Technologies ");
		System.out.println(sb);
	}
}
