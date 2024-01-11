 package com.cnstf.fourthweekstrings28_11_23;
//2.create generic classes and interface and then set the different kind of objects using generic type
public class GenericClass<T>{
	private T id;
	private T name;
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	
}
