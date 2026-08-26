package com.sohamglobal.classes;

public class Account {
	private String name;
	private double balance;
	
	//constructor function
	public Account()
	{
		name="unknown";
		balance=0.0;
		System.out.println("Constructor executed...");
	}
	
	public Account(String nm,double bal)
	{
		name=nm;
		balance=bal;
		System.out.println("parameterized constructor executed..");
	}
	public void showAccountDetails()
	{
		System.out.println("Account Name : "+name);
		System.out.println("Balance : "+balance);
	}

}
