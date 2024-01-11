package com.cnstf.secondweek15_11_23_1;

public class Ram {
	public String name;
	protected int age;
	String phno;
	private String location;
	
	public void nameOfPerson()
	{
		System.out.println("name of person is "+name );
	}
	private void locationOfPerson()
	{
		System.out.println("location of person is "+location);
	}
	void phnoOfPerson()
	{
		System.out.println("phno of person is "+phno);
	}
	protected void ageOfPerson()
	{
		System.out.println("age of person is "+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
