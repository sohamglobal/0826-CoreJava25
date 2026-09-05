package com.sohamglobal.classes;

public class Patient {
	
	private static String name;
	private String city;
			
	public void setName(String name) {
		this.name = name;
	}

	public static void showName()
	{
		System.out.println("Patient name is "+name);
	}
	
	

}
