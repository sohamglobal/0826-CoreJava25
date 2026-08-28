package com.sohamglobal.classes;

public class Addition {
	private int result;
			
	public void add(int a,int b)
	{
		result=a+b;
	}
	public void add(int x,int y,int z)
	{
		result=x+y+z;
	}
	
	public void showResult()
	{
		System.out.println("Sum is "+result);
	}

}
