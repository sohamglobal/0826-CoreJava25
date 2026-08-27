package com.sohamglobal.classes;

public class Person {
	private String name;
	
	public Person()
	{
		name="not available";
		System.out.println("no argument constructor executed");
	}
	
	public Person(String nm)
	{
		name=nm;
		System.out.println("parameterized constructor executed");
	}
	
	public Person(String firstname,String lastname)
	{
		name=firstname+" "+lastname;
		System.out.println("2 parameter constructor executed");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void show()
	{
		System.out.println(name);
	}

}
