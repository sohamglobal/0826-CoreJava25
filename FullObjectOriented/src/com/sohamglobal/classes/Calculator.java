package com.sohamglobal.classes;

public class Calculator {
	
	//data member
	private int result;
	
	//function members (methods)
	private void welcome()
	{
		System.out.println("welcome to sohamglobal");
	}
	public void calcSquare(int n)
	{
		welcome();
		result=n*n;
		System.out.println("Square is "+result);
	}
	public void add(int a,int b)
	{
		welcome();
		result=a+b;
		System.out.println("Sum is "+result);
		//System.out.println(n); not allowed
	}
	

}
