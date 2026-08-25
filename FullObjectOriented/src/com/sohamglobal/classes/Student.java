package com.sohamglobal.classes;

public class Student {
	private String name;
	private int marks;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}
		
	public void showResult()
	{
		if(marks>=35)
			System.out.println(name+" is pass");
		else
			System.out.println(name+" is fail");
			
	}

}
